package week3.day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
  private int id = 100;
  private double price;
  private String ownerName;
  private Date saleDate;

  private static int counter;

  public Ticket(double price, String ownerName) {
    this.price = price;
    this.ownerName = ownerName;
    saleDate = new Date();
    this.id = ++counter;
  }

  public static int getCounter(){
    return counter;
  }

  public void foo() {
    getCounter();
  }

  public static void staticFoo() {
    getCounter();
//    foo();
  }


  @Override
  public String toString() {
    String pattern = "dd MMM yyyy HH:mm";
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    return "Ticket{" +
      "id=" + id +
      ", price=" + price +
      ", ownerName='" + ownerName + '\'' +
      ", saleDate=" + format.format(saleDate) +
      '}';
  }
}
