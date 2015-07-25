package week3.day1.geometry;

public class Circle extends Figure{
  private double radius;

  public double getRadius() {
    return radius;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double square(){
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle {radius=" + radius + "}";
  }
}
