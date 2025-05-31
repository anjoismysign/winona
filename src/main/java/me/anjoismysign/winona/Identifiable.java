package me.anjoismysign.winona;

import org.jetbrains.annotations.NotNull;

public interface Identifiable {
  @NotNull
  String getIdentifier();
  
  default boolean equals(@NotNull Identifiable identifiable) {
    if (identifiable == null)
      return false; 
    return getIdentifier().equals(identifiable.getIdentifier());
  }
}
