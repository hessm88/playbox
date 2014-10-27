package fsjava.apprentice.badge.scripts.access.modifiers;

public class PositiveDecimalWithTenthPrecision {

  // The value in the tens place for any decimal numbers
  // in this class must be greater than 1.0 (e.g. 1.5
  // is allowed but 0.4 and -1.9 are not.
  public static final int LOWEST_TENS_PLACE_VALUE = 1;

  protected int tensValue;
  protected int tenthsValue;

  public PositiveDecimalWithTenthPrecision(int tensValue, int tenthsValue) {
    if (tensValue < LOWEST_TENS_PLACE_VALUE) {
      throw new IllegalArgumentException("Tens value must be >= " + LOWEST_TENS_PLACE_VALUE);
    }

    this.tensValue = tensValue;
    this.tenthsValue = tenthsValue;
  }

  public void printValue() {
    System.out.println(tensValue + "." + tenthsValue);
  }

}
