package week6.day1;

public class TestEnum {
  public static void main(String[] args) {
    Ocean ocean = Ocean.ANTARCTIC;
    Ocean ocean1 = Ocean.PACIFIC;

    System.out.println(ocean.compareTo(ocean1));

    Ocean ind = Ocean.valueOf("INDIAN");
    System.out.println(ind);

    for (Ocean o : Ocean.values()) {
      System.out.println(o);
    }
  }
}
