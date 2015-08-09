package week4.day2;

public class Patron {
  private final double caliber;

  public Patron(double caliber) {
    this.caliber = caliber;
  }

  public double getCaliber() {
    return caliber;
  }

  @Override
  public String toString() {
    return "Patron{" +
      "caliber=" + caliber +
      '}';
  }
}
