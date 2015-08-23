package week6.day2;

import java.io.File;
import java.io.IOException;

public class TestFile {
  public static void main(String[] args) throws IOException {
    String filePath = "/home/amakogon/";
    File file = new File(filePath);
//    file.createNewFile();

    for (File f : file.listFiles()) {
      if (f.isDirectory() && !f.isHidden()) {
        System.out.println(f.getAbsolutePath());
      }
    }
  }
}
