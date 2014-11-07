package apprentice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortScript {

  private static final String FILE_PREPEND = "C:\\Users\\mgh14\\Desktop\\";

  public static void main(String ... args) {
    final SortScript sortScript = new SortScript();

    // parse file
    final List<String> unsortedStrings = sortScript.parseFile("10k-lines.txt");
    System.out.println("Size: " + unsortedStrings.size());

    // sort strings
    final Object[] stringArray = unsortedStrings.toArray();
    Arrays.sort(stringArray);
    final List<String> sortedStrings = new LinkedList<String>();
    final LinkedList<String> reverseSortedStrings = new LinkedList<String>();
    for(Object o : stringArray) {
      sortedStrings.add((String) o);
      reverseSortedStrings.addFirst((String) o);
    }

    // write to file
    sortScript.writeSortedToFile(sortedStrings, "sorted-results.txt");
    sortScript.writeSortedToFile(reverseSortedStrings, "reverse-sorted-results.txt");
  }

  private void writeSortedToFile(List<String> sortedStrings, String filename) {
    PrintWriter writer;
    try {
      writer = new PrintWriter(FILE_PREPEND + filename, "UTF-8");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
      return;
    }
    catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      return;
    }

    for(String line : sortedStrings) {
      writer.println(line);
    }

    writer.close();
  }

  private List<String> parseFile(String filename) {
  String csvFile = "C:\\Users\\mgh14\\Desktop\\" + filename;

  final List<String> fileStrings = new LinkedList<String>();
  BufferedReader br = null;
  String line;
  try {
    br = new BufferedReader(new FileReader(csvFile));
    while ((line = br.readLine()) != null) {
      fileStrings.add(line);
    }
  } catch(FileNotFoundException e) {
    System.out.println("File not found: " + filename);
    System.exit(-1);
  } catch(IOException e) {
    System.out.println(e.toString());
    System.exit(-1);
  } finally {
    if (br != null) {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

    return fileStrings;
  }

}
