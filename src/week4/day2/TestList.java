package week4.day2;

import collections.IList;
import collections.impl.MyList;

public class TestList {
  public static void main(String[] args) {
    IList list = new MyList(2);
    list.add("Hello");
    list.add("world");
    list.add("!");

    list.add("1", 3);
    list.add("534", 1);

    list.remove("1");
    list.remove(0);
//    System.out.println(list.get(0));
//    System.out.println(list.get(1));

    System.out.println(list);
  }
}
