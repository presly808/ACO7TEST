package week4.day2;

import collections.IList;
import collections.MyList;

public class TestList {
  public static void main(String[] args) {
    IList list = new MyList(2);
    list.add("Hello");
    list.add("world");
    list.add("!");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
  }
}
