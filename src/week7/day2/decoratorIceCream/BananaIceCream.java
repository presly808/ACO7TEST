package week7.day2.decoratorIceCream;

public class BananaIceCream extends IceCream {

  public BananaIceCream() {
    super("Banana iceCream");
  }

  @Override
  public double cost() {
    return 0.8;
  }
}
