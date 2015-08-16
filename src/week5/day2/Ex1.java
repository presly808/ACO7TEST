package week5.day2;

import week5.day1.Cat;

public class Ex1 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Cat cat1 = new Cat("Vasia");

    try {
      cat1.foo();
    } catch (CloneNotSupportedException e) {
      System.out.println("We catch an exception!");
      e.printStackTrace();
    }
//    cat1.foo();

    System.out.println("After catch");
  }
}
