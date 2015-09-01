package week7.day2.drink;

import week7.day2.drink.additeve.Additive;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {
  private String description;
  private double price;
  private List<Additive> additiveList = new ArrayList<Additive>();

  Drink(String description, double price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    StringBuilder descriptionBuilder = new StringBuilder(description);
    for (Additive additive : additiveList) {
      descriptionBuilder.append(", ").append(additive.getDescription());
    }
    return descriptionBuilder.toString();
  }

  public double getPrice() {
    return price;
  }

  public void add(Additive additive) {
    additiveList.add(additive);
  }

  public final double calculateCost() {
    double totalCost = price;
    for (Additive additive : additiveList) {
      totalCost += additive.getCost();
    }
    return totalCost;
  }
}
