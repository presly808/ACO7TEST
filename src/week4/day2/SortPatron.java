package week4.day2;

import java.util.Arrays;
import java.util.Comparator;

public class SortPatron {
  public static void main(String[] args) {
    Patron[] oboima = new Patron[5];
    oboima[0] = new Patron(9);
    oboima[1] = new Patron(29);
    oboima[2] = new Patron(50);
    oboima[3] = new Patron(9);
    oboima[4] = new Patron(36);

    System.out.println(Arrays.toString(oboima));
    Arrays.sort(oboima, new Comparator<Patron>() {
      @Override
      public int compare(Patron o1, Patron o2) {
        if (o1.getCaliber() > o2.getCaliber()) {
          return 1;
        } else if (o1.getCaliber() < o2.getCaliber()) {
          return -1;
        }
        return 0;
      }
    });
    System.out.println(Arrays.toString(oboima));

  }
}
