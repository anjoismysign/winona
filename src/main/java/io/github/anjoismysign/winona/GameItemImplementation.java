package io.github.anjoismysign.winona;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Set;

public interface GameItemImplementation<T extends GameItem, R, I> {
  void registerLoader(@NotNull GameItemLoader<R, I> paramGameItemLoader);
  
  @NotNull
  Set<String> keys();
  
  @Nullable
  default T getItem(@NotNull String identifier) {
    return getItem(identifier, "en_us");
  }
  
  @Nullable
  T getItem(@NotNull String paramString1, @Nullable String paramString2);
  
  @NotNull
  default T fallback(@NotNull String identifier, @Nullable String locale) {
    T lookup = getItem(identifier, locale);
    return (lookup != null) ? lookup : (T)Objects.<GameItem>requireNonNull((GameItem)getItem(identifier), "'lookup' is null");
  }
}
