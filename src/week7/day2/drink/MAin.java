package week7.day2.drink;

import week7.day2.drink.additeve.Milk;
import week7.day2.drink.additeve.Sugar;

public class MAin {
  public static void main(String[] args) {
    Drink drink = new Tea();
    drink.add(new Milk());
    drink.add(new Sugar());

    System.out.println(drink.getDescription());
    System.out.println(drink.calculateCost());


  }
}
