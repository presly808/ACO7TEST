package week2.day2;

public class IceDragon extends Dragon {
  private int iceDamage;

  public IceDragon(int iceDamage, int damage, String color) {
    super(damage, color);
    this.iceDamage = iceDamage;
  }

  public void freeze() {
//    damage
    System.out.println("Freeze with damage " + iceDamage);
  }

  @Override
  public void voice() {
    System.out.println("Privet");
  }
}
