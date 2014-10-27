package fsjava.apprentice.badge.scripts;

public class OverloadConstructorsScript {

  private boolean someBool;
  private int someNumber;
  private char someChar;
  private String someString;

  private static final int DEFAULT_NUMBER = 1;
  private static final char DEFAULT_CHAR = 'a';
  private static final String DEFAULT_STRING = "default-string";

  public static void main(String ... args) {
    OverloadConstructorsScript overloadedOne = new OverloadConstructorsScript(true);
    OverloadConstructorsScript overloadedTwo = new OverloadConstructorsScript(true, 2);
    OverloadConstructorsScript overloadedThree = new OverloadConstructorsScript(false, 3, 'b');
    OverloadConstructorsScript overloadedFour = new OverloadConstructorsScript(false, 4, 'c', "not-default-string");

    overloadedOne.printClassVariableValues();
    overloadedTwo.printClassVariableValues();
    overloadedThree.printClassVariableValues();
    overloadedFour.printClassVariableValues();
  }

  public OverloadConstructorsScript(boolean aBoolean) {
    setClassVariables(aBoolean, DEFAULT_NUMBER, DEFAULT_CHAR, DEFAULT_STRING);
  }

  public OverloadConstructorsScript(boolean aBoolean, int aNumber) {
    setClassVariables(aBoolean, aNumber, DEFAULT_CHAR, DEFAULT_STRING);
  }

  public OverloadConstructorsScript(boolean aBoolean, int aNumber, char aChar) {
    setClassVariables(aBoolean, aNumber, aChar, DEFAULT_STRING);
  }

  public OverloadConstructorsScript(boolean aBoolean, int aNumber, char aChar, String aString) {
    setClassVariables(aBoolean, aNumber, aChar, aString);
  }

  private void setClassVariables(boolean aBoolean, int aNumber, char aChar, String aString) {
    someBool = aBoolean;
    someNumber = aNumber;
    someChar = aChar;
    someString = aString;
  }

  private void printClassVariableValues() {
    System.out.println("Characteristics for object " + this + ":");

    System.out.println("Boolean variable: " + someBool);

    System.out.print("Int variable: " + someNumber);
    if (someNumber == DEFAULT_NUMBER) {
      System.out.print(" (default)");
    }
    System.out.println();

    System.out.print("Char variable: " + someChar);
    if (someChar == DEFAULT_CHAR) {
      System.out.print(" (default)");
    }
    System.out.println();

    System.out.print("String variable: " + someString);
    if (someString.equals(DEFAULT_STRING)) {
      System.out.print(" (default)");
    }
    System.out.println();

    System.out.println();
  }

}
