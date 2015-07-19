package week1;

public class TestStringHelper {
  public static void main(String[] args) {
    String input = "1-Ivan,2-Oleg,3-Sergii,4-Petro";
    String res = StringHelper.processAndCutNames(input);
    System.out.println(res);
  }
}
