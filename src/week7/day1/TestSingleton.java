package week7.day1;

public class TestSingleton {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    Singleton oneMoreReferenceOnSingleton = Singleton.getInstance();
  }
}
