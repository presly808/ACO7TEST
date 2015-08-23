package week6.day2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteEx {
  public static void main(String[] args) throws IOException {
    String fileName = "/home/amakogon/myFile";
    PrintWriter writer = null;
    try {
      writer = new PrintWriter(new FileWriter(fileName, true));
      writer.write("London is the capital of Great Brittan");
    } finally {
      if (writer != null) {
        writer.close();
      }
    }
  }
}
