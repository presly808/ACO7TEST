package week3.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
  public static void main(String[] args) {

    Date date = new Date();

    Date date1 = new Date(237492747322l);

    System.out.println(date);
    System.out.println(date1);

    System.out.println(date.getTime() > date1.getTime());

    String pattern = "dd MMM yyyy HH:mm";
    SimpleDateFormat format = new SimpleDateFormat(pattern);

    System.out.println(format.format(date));
    System.out.println(format.format(date1));

  }
}
