package week3.day2;

public class BadNumber extends MyNumber{

  public BadNumber(int value) {
    super(value);
  }

  @Override
  public final int getValue() {
    return super.getValue() * 2;
  }
}
