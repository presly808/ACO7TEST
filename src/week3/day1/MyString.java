package week3.day1;

public class MyString {

  private char[] symbols;

  public MyString(char[] symbols) {
    this.symbols = symbols;
  }

  public MyString(String str) {
    this.symbols = str.toCharArray();
  }

  public boolean contains(MyString str) {
    if (symbols.length < str.length()) {
      return false;
    }
    boolean result = false;
    for (int i = 0; i < symbols.length; i++) {
      if (symbols[i] == str.charAt(0)) {

        //check result
        int counter = 1;
        for (int j = 1; j < str.length() && j + i < symbols.length; j++) {
          if (str.charAt(j) != symbols[j + i]) {
            break;
          }
          counter++;
        }
        if (counter == str.length()) {
          result = true;
        }
      }
    }
    return result;
  }

  public char charAt(int index) {
    return symbols[index];
  }

  public int length() {
    return symbols.length;
  }

  public MyString substring(int start) {
    return null;
  }

  public MyString substring(int start, int end) {
    return null;
  }


}
