package fsjava.apprentice.badge.scripts.common.logic;

public class CompositionExample {

  public static void main(String ... args) {
    final IndependentFileWriter fileWriter = new IndependentFileWriter();
    final IndependentXmlWriter xmlWriter = new IndependentXmlWriter();
    fileWriter.setXmlWriter(xmlWriter);

    final String name = "matt";
    final String email = "mhess@familysearch.org";
    fileWriter.writeNameAndPasswordToText(name, email);
    fileWriter.writeNameAndPasswordToXml(name, email);
  }
}
