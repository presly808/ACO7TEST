package week2.day2;

public class TestDragon {
  public static void main(String[] args) {
    Dragon dragon1 = new FireDragon(100, 100, "Green");

    dragon1.fly();
    dragon1.attack();

    Dragon kindDragon = new FireDragon(100, 0, "Pink");
    System.out.println("~~~~~~~~~~");

    FireDragon badToTheBoneDragon = new FireDragon(200);
    badToTheBoneDragon.spitFire();

    System.out.println("~~~~~~~~~~");
    IceDragon subZero = new IceDragon(700, 100, "White");
    subZero.freeze();
    subZero.fly();


  }
}
