package week3.day1.geometry;

public class Point {
  private final int x;
  private final int y;
  private final Color color;

  public static final Point ZERO_POINT = new Point(0, 0);


  public Point(int x, int y, Color color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public Point(int x, int y) {
    this(x, y, new Color(""));
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
//    return "[x=" + x + ", y=" + y + ", " + color;
    return String.format("[x=%d, y=%d, %s", x, y, color);
  }
}
