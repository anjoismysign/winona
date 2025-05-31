package me.anjoismysign.winona;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public interface GameItemLoader<R, I> {
  @NotNull
  R registrant();
  
  @NotNull
  Consumer<I> onLoad();
}
