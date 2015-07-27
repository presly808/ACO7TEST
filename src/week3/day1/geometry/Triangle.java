package week3.day1.geometry;

public class Triangle extends Figure {
  private double height;
  private double base;

  public Triangle(double height, double base) {
    this.height = height;
    this.base = base;
  }

  public double square() {
    return 0.5 * height * base;
  }

  @Override
  public double perimeter() {
    //TODO: write formula
    return 0;
  }
}
