package week2.day2;

public class TestDragon {
  public static void main(String[] args) {
    Dragon dragon1 = new Dragon(100, "Green");

    dragon1.fly();
    dragon1.attack();

    Dragon kindDragon = new Dragon(0, "Pink");

    FireDragon badToTheBoneDragon = new FireDragon(200);
    badToTheBoneDragon.spitFire();

    IceDragon subZero = new IceDragon(700, 100, "White");
    subZero.freeze();



  }
}
