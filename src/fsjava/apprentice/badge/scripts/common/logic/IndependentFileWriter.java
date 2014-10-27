package fsjava.apprentice.badge.scripts.common.logic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IndependentFileWriter {

  private static final String FILE_PREPEND = "C:\\Users\\mgh14\\Desktop\\";

  private IndependentXmlWriter xmlWriter;

  public IndependentFileWriter() {
  }

  public void setXmlWriter(IndependentXmlWriter xmlWriter) {
    this.xmlWriter = xmlWriter;
  }

  public void writeNameAndPasswordToText(String name, String email) {
    final PrintWriter printWriter = getPrintWriter("plain-text-common-logic.txt");

    printWriter.println("Name: " + name);
    printWriter.println("email: " + email);

    closePrintWriter(printWriter);
  }

  public void writeNameAndPasswordToXml(String name, String email) {
    if (xmlWriter != null) {
      final PrintWriter printWriter = getPrintWriter("xml-common-logic.xml");
      xmlWriter.writeToXml(name, email, printWriter);

      closePrintWriter(printWriter);
    }
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
