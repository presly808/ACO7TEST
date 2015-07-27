package week3.day1.geometry;

public class Ex2 {
  public static void main(String[] args) {
    Point point = new Point(2, 1);
    Point point1 = new Point(1, 1);

    System.out.println(getDistance(point1 , point));

    Point zero = new Point(0, 0);
    System.out.println(getDistance(zero, point));
    System.out.println(getDistance(Point.ZERO_POINT, point1));

    System.out.println(Math.PI);

    System.out.println(point);

  }

  public static double getDistance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) +
                       Math.pow((p2.getY() - p1.getY()), 2));
  }
}
