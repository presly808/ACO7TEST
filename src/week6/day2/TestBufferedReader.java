package week6.day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
  public static void main(String[] args) throws IOException {
    String filePath = "/home/amakogon/myFile";
    BufferedReader reader = null;
    try {
      reader= new BufferedReader(new FileReader(filePath));
      StringBuilder builder  = new StringBuilder();
      while (reader.ready()) {
        builder.append(reader.readLine());
      }
      System.out.println(builder);
    } finally {
      if (reader != null) {
        reader.close();
      }
    }


  }
}
