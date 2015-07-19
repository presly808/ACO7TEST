package week2.day1;

public class Item {
  private double price;
  private String description = "";

  public Item(double itemPrice) {
    price = itemPrice;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String itemDescription) {
    description = itemDescription;
  }

  public String asString() {
    return "Price=" + price + "$. " + description;
  }

  public boolean isSame(Item item) {
    return item.getPrice() == price && description.equals(item.description);
  }
}
