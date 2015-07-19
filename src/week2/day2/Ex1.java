package week2.day2;

import week2.day1.Item;

public class Ex1 {
  public static void main(String[] args) {
    Item item1 = new Item(5);
    item1.setPrice(12);
    item1.setDescription("Pen");

    Item item2 = new Item(12);


    //doesn't work
    if(item1 == item2){
      System.out.println("Ha ha");
    }

//    if(item1.getPrice() == item2.getPrice()) {
//      System.out.println("They equal");
//    }

    if(item1.isSame(item2)) {
      System.out.println("They equal");
    }

  }
}
