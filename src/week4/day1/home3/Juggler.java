package week4.day1.home3;

public class Juggler extends Artist {

  public Juggler(String name, String position) {
    super(name, position);
  }

  @Override
  public void perform() {
    System.out.println("Joggling with 5 balls");
  }
}
