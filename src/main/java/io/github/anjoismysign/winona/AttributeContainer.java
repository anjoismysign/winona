package io.github.anjoismysign.winona;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Objects;

public interface AttributeContainer {
  @NotNull
  Map<String, Object> data();
  
  @Nullable
  default <T> T getData(@NotNull String key, @NotNull Class<T> clazz) {
    Object object = data().get(key);
    if (clazz.isInstance(object))
      return (T)object; 
    return null;
  }
  
  default <T> void setData(@NotNull String key, @Nullable T data) {
    Objects.requireNonNull(data);
    data().put(key, data);
  }
}
