package fsjava.apprentice.badge.scripts.common.logic;

import java.io.PrintWriter;

public class IndependentXmlWriter {

  public void writeToXml(String name, String email, PrintWriter printWriter) {
    printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    printWriter.println("<user>");
      printWriter.print("\t<name>");
      printWriter.print(name);
      printWriter.print("</name>");

      printWriter.println();

      printWriter.print("\t<email>");
      printWriter.print(email);
      printWriter.print("</email>");

      printWriter.println();
    printWriter.println("</user>");
  }
}
