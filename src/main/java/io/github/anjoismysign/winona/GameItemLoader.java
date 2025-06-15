package io.github.anjoismysign.winona;

import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public interface GameItemLoader<R, I> {
  @NotNull
  R registrant();
  
  @NotNull
  Consumer<I> onLoad();
}
