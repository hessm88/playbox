package apprentice.Exceptions;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedException {

  public static void main(String ... args) {
    Path path = Paths.get("a-nonexistent-file");
    BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);;
  }
}
