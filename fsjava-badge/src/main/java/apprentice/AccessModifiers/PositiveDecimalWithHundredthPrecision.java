package apprentice.AccessModifiers;

import java.util.Scanner;

public class PositiveDecimalWithHundredthPrecision extends PositiveDecimalWithTenthPrecision {

  protected int hundredthsValue;

  public PositiveDecimalWithHundredthPrecision(int tensValue, int tenthsValue, int hundredthsValue) {
    super(tensValue, tenthsValue);
    this.hundredthsValue = hundredthsValue;
  }

  @Override
  public void printValue() {
    System.out.println(super.tensValue + "" + super.tenthsValue + "" + hundredthsValue);
  }

  public static void main(String ... args) {
    final Scanner inputScanner = new Scanner(System.in);

    int tensPlace = 0;
    int tenthsPlace, hundredthsPlace;
    while (tensPlace > -1) {
      System.out.print("\nEnter a tens place number: ");
      tensPlace = inputScanner.nextInt();
      if(tensPlace < PositiveDecimalWithTenthPrecision.LOWEST_TENS_PLACE_VALUE) {
        System.out.println("Input of \"" + tensPlace + "\" is not allowed");
        continue;
      }

      System.out.print("Enter a tenths place number: ");
      tenthsPlace = inputScanner.nextInt();

      System.out.print("Enter a hundredths place number: ");
      hundredthsPlace = inputScanner.nextInt();

      final PositiveDecimalWithTenthPrecision tenthPrecisionDecimal = new PositiveDecimalWithTenthPrecision(tensPlace, tenthsPlace);
      System.out.print("Tenth precision: ");
      tenthPrecisionDecimal.printValue();

      final PositiveDecimalWithHundredthPrecision hundredthPrecisionDecimal = new PositiveDecimalWithHundredthPrecision(tensPlace, tenthsPlace, hundredthsPlace);
      System.out.print("Hundredth precision: ");
      hundredthPrecisionDecimal.printValue();
    }
  }

}
