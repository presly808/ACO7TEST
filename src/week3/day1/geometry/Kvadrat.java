package week3.day1.geometry;

public class Kvadrat extends Figure{

  private double side;

  public Kvadrat(double side) {
    this.side = side;
  }

  @Override
  public double square(){
    return side * side;
  }
}
