package apprentice.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UncheckedException {

  public static void main(String ... args) {
    Path path = Paths.get("a-nonexistent-file");
    BufferedReader reader;
    try {
      reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("Unchecked (runtime) exception caught: ");
      e.printStackTrace();
    }
  }

}
