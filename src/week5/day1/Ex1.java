package week5.day1;

import collections.IList;
import collections.impl.MyList;

public class Ex1 {
  public static void main(String[] args) {
    IList<String> list = new MyList<String>();
    list.add("2");
    list.add("5");

//    list.add(6);

    showStrings(list);
  }

  public static void showStrings(IList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      System.out.println(s);
    }
  }
}
