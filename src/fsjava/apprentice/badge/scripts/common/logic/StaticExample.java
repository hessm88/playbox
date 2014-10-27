package fsjava.apprentice.badge.scripts.common.logic;

import java.io.PrintWriter;

public class StaticExample {

  public static void main(String ... args) {
    final String name = "matt";
    final String email = "mhess@familysearch.org";

    writeNameAndPasswordToText(name, email);

    writeNameAndPasswordToXml(name, email);
  }

  public static void writeNameAndPasswordToText(String name, String email) {
    final PrintWriter printWriter = StaticMethods.getPrintWriter("static-plain-text-common-logic.txt");

    printWriter.println("Name: " + name);
    printWriter.println("email: " + email);

    StaticMethods.closePrintWriter(printWriter);
  }

  public static void writeNameAndPasswordToXml(String name, String email) {
    final PrintWriter printWriter = StaticMethods.getPrintWriter("static-xml-common-logic.xml");
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

    StaticMethods.closePrintWriter(printWriter);
  }

}
