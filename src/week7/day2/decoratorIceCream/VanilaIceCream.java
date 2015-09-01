package week7.day2.decoratorIceCream;

public class VanilaIceCream extends IceCream {
  protected VanilaIceCream() {
    super("Vanila iceCream");
  }

  @Override
  public double cost() {
    return 1.1;
  }
}
