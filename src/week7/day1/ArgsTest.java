package week7.day1;

public class ArgsTest {
  public static void main(String[] args) {
    System.out.println("Hi!");
    parseArgs("2", args);
  }

  public static void parseArgs(String firstArg, String... args){
    String message = "Hi! Input args - ";
    StringBuilder builder = new StringBuilder(message);
    for (String arg : args) {
      builder.append(", " + arg);
    }
    System.out.println(builder);
  }
}
