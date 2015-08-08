package week4.day1.home3;

public class AcrobatJuggler extends Acrobat {
  public AcrobatJuggler(String name, String position) {
    super(name, position);
  }

  @Override
  public void perform() {
    System.out.println("Salto + juggling");
  }
}
