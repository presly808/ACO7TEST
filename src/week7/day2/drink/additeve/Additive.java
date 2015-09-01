package week7.day2.drink.additeve;

public abstract class Additive {
  private String description;
  private double cost;

  Additive(String description, double cost) {
    this.description = description;
    this.cost = cost;
  }

  public double getCost() {
    return cost;
  }

  public String getDescription() {
    return description;
  }
}
