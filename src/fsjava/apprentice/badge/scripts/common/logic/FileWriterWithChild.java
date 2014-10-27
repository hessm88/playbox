package fsjava.apprentice.badge.scripts.common.logic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileWriterWithChild {

  private static final String FILE_PREPEND = "C:\\Users\\mgh14\\Desktop\\";

  public void writeNameAndPasswordToText(String name, String email) {
    final PrintWriter printWriter = getPrintWriter("inheritance-plain-text-common-logic.txt");

    printWriter.println("Name: " + name);
    printWriter.println("email: " + email);

    closePrintWriter(printWriter);
  }

  protected PrintWriter getPrintWriter(String filename) {
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

  protected void closePrintWriter(PrintWriter writer) {
    if (writer != null) {
      writer.close();
    }
  }

}
