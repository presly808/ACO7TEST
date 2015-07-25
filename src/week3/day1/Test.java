package week3.day1;

public class Test {
  public static void main(String[] args) {

  }

  public static int countX(String str) {
    if(str == null || str.isEmpty()){
      return 0;
    }

    int res = str.charAt(0) == 'x' ? 1 : 0;
    if(str.length() == 1) {
      return res;
    }
    return res + countX(str.substring(1));
  }

  public static int countHi(String str) {
    if(str == null || str.length() < 2){
      return 0;
    }
    String firstTwo = str.substring(0, 2);
    int result = firstTwo.equals("hi") ? 1 : 0;
    if(str.length() == 2) {
      return result;
    }

    return result + countHi(str.substring(1));
  }

}
