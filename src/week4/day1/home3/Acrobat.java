package week4.day1.home3;

public class Acrobat extends Artist {

  public Acrobat(String name, String position) {
    super(name, position);
  }

  @Override
  public void perform() {
    System.out.println("Doing backflip salto");
  }
}
