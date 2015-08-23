package week6.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    String filePath = "/home/amakogon/myFile";
    InputStream inputStream = null;
    try {
      inputStream = new FileInputStream(filePath);
      StringBuilder builder = new StringBuilder();
      int result;
      do {
        result = inputStream.read();
        builder.append((char) result);
      } while (result != -1);
      System.out.println(builder);

    } catch (FileNotFoundException e) {
      System.err.println("No such file :" + e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
