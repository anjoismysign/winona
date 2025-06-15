package io.github.anjoismysign.winona.archive;

import io.github.anjoismysign.winona.Archive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public record MarkdownArchive(@NotNull String content) implements Archive<String> {
  
  @Nullable
  public File store(@NotNull Path path) {
    if (!Files.isDirectory(path))
      return null;
    File file = path.toFile();
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
      try {
        writer.write(this.content);
        writer.close();
      } catch (Throwable throwable) {
        try {
          writer.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (IOException exception) {
      exception.printStackTrace();
    } 
    return file;
  }
}
