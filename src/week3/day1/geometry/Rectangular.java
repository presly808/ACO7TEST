package week3.day1.geometry;

public class Rectangular extends Figure{
  private int width;
  private int height;

  public Rectangular(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public double square(){
    return width * height;
  }

  @Override
  public double perimeter() {
    return 2 * (width + height);
  }


}
