package week4.day2.inner;

public class TestInner {
  public static void main(String[] args) {
    Outer outer = new Outer(7);
//    Outer.Inner inner = outer.new Inner(8);

    outer.outerMethod();

//    inner.innerMethod();

//    inner.showX();

//    Outer.Nested nested = new Outer.Nested();
  }
}
