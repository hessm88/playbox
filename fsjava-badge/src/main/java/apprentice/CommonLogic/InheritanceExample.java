package apprentice.CommonLogic;

public class InheritanceExample {

  public static void main(String ... args) {
    final String name = "matt";
    final String email = "mhess@familysearch.org";

    final FileWriterWithChild fileWriter = new FileWriterWithChild();
    fileWriter.writeNameAndPasswordToText(name, email);

    final XmlWriterChild xmlWriter = new XmlWriterChild();
    xmlWriter.writeNameAndPasswordToText(name, email);
  }
}
