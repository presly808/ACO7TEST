package week4.day2.inner;

public class Outer {

  private int x;
  public static int counter;
  private Inner inner;

  public Outer(int x) {
    this.x = x;
  }

  public void outerMethod() {
    System.out.println(x);
  }

  private class Inner {
    private int y;
    private int x = 123;
//    private static int staticY = 16;

    public Inner(int y) {
      this.y = y;
    }
//    public static void foo(){};

    public void innerMethod() {
      System.out.println(y);
      System.out.println("outer field =" + x);
      System.out.println(counter);
      outerMethod();
    }

    public void showX() {
      System.out.println(Outer.this.x);
    }

  }

  private static class Nested {

    public void nestedMethod() {
//      System.out.println(x);
      System.out.println(counter);
    }
  }
}
