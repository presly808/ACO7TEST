package week7.day2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIO {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/amakogon/myFile")));

    int res;
    StringBuilder builder = new StringBuilder();
    while ((res = inputStream.read()) != -1) {
      builder.append((char) res);
    }
    System.out.println(builder);
  }
}
