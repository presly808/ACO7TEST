package week7.day2.decoratorIceCream.dobavka;

import week7.day2.decoratorIceCream.IceCream;

public abstract class DobavkaDecorator extends IceCream {

  protected IceCream iceCream;
  private double price;

  protected DobavkaDecorator(IceCream iceCream, double price) {
    this.iceCream = iceCream;
    this.price = price;
  }

  public abstract String getDescription();

  public IceCream getIceCream() {
    return iceCream;
  }

  public double getPrice() {
    return price;
  }
}
