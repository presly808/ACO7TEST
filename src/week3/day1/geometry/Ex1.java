package week3.day1.geometry;

public class Ex1 {
  public static void main(String[] args) {
    Circle circle = new Circle(2);
    System.out.println(circle);

    Color color = new Color("Green");
    Point p1 = new Point(2,1, color);
    System.out.println(p1);

    color.setName("Red");
    System.out.println(p1);
  }
}
