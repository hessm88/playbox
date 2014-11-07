package apprentice.CommonLogic;

import java.io.PrintWriter;

public class XmlWriterChild extends FileWriterWithChild {

  @Override
  public void writeNameAndPasswordToText(String name, String email) {
    final PrintWriter printWriter = super.getPrintWriter("inheritance-xml-common.xml");

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

    super.closePrintWriter(printWriter);
  }

}
