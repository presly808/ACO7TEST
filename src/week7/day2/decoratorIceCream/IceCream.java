package week7.day2.decoratorIceCream;

public abstract class IceCream {
  private String description;

  protected IceCream() {
  }

  protected IceCream(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
