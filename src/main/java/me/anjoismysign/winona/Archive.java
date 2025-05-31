package me.anjoismysign.winona;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Archive<T> {
  @Nullable
  default File storeAs(@NotNull File file, @NotNull String name) {
    if (!file.isDirectory())
      return null; 
    Path path = Paths.get(file.getAbsolutePath(), new String[] { name });
    return store(path);
  }
  
  @Nullable
  File store(@NotNull Path paramPath);
  
  @NotNull
  T content();
}
