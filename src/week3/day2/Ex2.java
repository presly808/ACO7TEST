package week3.day2;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    MyNumber n1 = new MyNumber(5);
    n1 = new BadNumber(5);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");

    int input = sc.nextInt();
    if(input > n1.getValue()){
      System.out.println("Bingo!");
    }
  }
}
