package me.anjoismysign.winona;

import org.jetbrains.annotations.Nullable;

public interface Interactable {
  @Nullable
  Runnable interact();
  
  @Nullable
  Runnable alternativeInteract();
}
