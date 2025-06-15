package io.github.anjoismysign.winona;

import org.jetbrains.annotations.NotNull;

public interface Scheduler<T> {
  T sync(@NotNull Runnable paramRunnable);
  
  T syncLater(@NotNull Runnable paramRunnable, long paramLong);
  
  T syncTimer(@NotNull Runnable paramRunnable, long paramLong1, long paramLong2);
  
  T async(@NotNull Runnable paramRunnable);
  
  T asyncLater(@NotNull Runnable paramRunnable, long paramLong);
  
  T asyncTimer(@NotNull Runnable paramRunnable, long paramLong1, long paramLong2);
}
