package week7.day2.decoratorIceCream.dobavka;

import week7.day2.decoratorIceCream.IceCream;

public class Chocolate extends DobavkaDecorator {


  public Chocolate(IceCream iceCream) {
    super(iceCream, 0.2);
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + ", chocolate";
  }

  @Override
  public double cost() {
    return getPrice() + iceCream.cost();
  }
}
