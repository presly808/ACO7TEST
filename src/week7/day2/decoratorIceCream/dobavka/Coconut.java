package week7.day2.decoratorIceCream.dobavka;

import week7.day2.decoratorIceCream.IceCream;

public class Coconut extends DobavkaDecorator {

  public Coconut(IceCream iceCream) {
    super(iceCream, 0.15);
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + ", coconut";
  }

  @Override
  public double cost() {
    return getPrice() + iceCream.cost();
  }
}
