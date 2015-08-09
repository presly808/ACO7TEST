package week4.day2;

import java.util.Scanner;

public class AppCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first value");
    int first = scanner.nextInt();
    System.out.println("Enter second value");
    int second = scanner.nextInt();

    System.out.println("Enter operation");
    String oper = scanner.next();
    ICalculator calculator = new SimpleCalculator();

    int result = 0;
    switch (oper.charAt(0)) {
      case '+':
        result = calculator.sum(first, second);
        break;
      case '-':
        result = calculator.minus(first, second);
        break;
      case '/':
        result = calculator.div(first, second);
        break;
      case '*':
        result = calculator.mult(first, second);
        break;
      default:
        System.out.println("Incorrect input");
        break;
    }

    System.out.println("Result = " + result);

  }

}
