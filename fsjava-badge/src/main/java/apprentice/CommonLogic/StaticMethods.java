package apprentice.CommonLogic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StaticMethods {

  private static final String FILE_PREPEND = "C:\\Users\\mgh14\\Desktop\\";

  static protected PrintWriter getPrintWriter(String filename) {
    try {
      return new PrintWriter(FILE_PREPEND + filename, "UTF-8");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }
    catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      return null;
    }
  }

  static protected void closePrintWriter(PrintWriter writer) {
    if (writer != null) {
      writer.close();
    }
  }

}
