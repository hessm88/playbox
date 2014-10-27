package fsjava.apprentice.badge.scripts.instance.of.and.casting;

public class ReverseName extends Name {

  public ReverseName(String first, String last) {
    super(first, last);
  }

  public String getLastNameThenFirst() {
    return lastName + " " + firstName;
  }

  public static void main(String ... args) {
    final String firstName = "Mr";
    final String lastName = "Test";

    final Name regularName = new Name(firstName, lastName);
    final Name reversedName = new ReverseName(firstName, lastName);

    System.out.println("Result of regular name:");
    printReversedName(regularName);
    System.out.println("Result of reversed name");
    printReversedName(reversedName);
  }

  private static void printReversedName(Name name) {
    if (name instanceof ReverseName) {
      final ReverseName reversedName = (ReverseName) name;
      System.out.println("\t" + reversedName.getLastNameThenFirst());
    }
    else {
      System.out.println("\tNot an instance of the LastNameFirst class");
    }
  }

}
