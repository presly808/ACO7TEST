package week7.day1;

public class Singleton {

  private static Singleton instance = null;

  private Singleton() {
    System.out.println("instance created");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
