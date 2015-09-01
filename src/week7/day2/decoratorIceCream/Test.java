package week7.day2.decoratorIceCream;

import week7.day2.decoratorIceCream.dobavka.Chocolate;
import week7.day2.decoratorIceCream.dobavka.Coconut;

public class Test {
  public static void main(String[] args) {
    IceCream iceCream = new BananaIceCream();
    iceCream = new Chocolate(iceCream);
    iceCream = new Chocolate(iceCream);
    iceCream = new Coconut(iceCream);

    System.out.println(iceCream.getDescription());
    System.out.printf("Total price = %.2f", iceCream.cost());

    System.out.println();
    IceCream vanila = new Coconut(new Chocolate(new VanilaIceCream()));
    System.out.println(vanila.getDescription());
    System.out.printf("Total price = %.2f", vanila.cost());
  }
}
