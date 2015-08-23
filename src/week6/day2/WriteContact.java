package week6.day2;

import week1.contact.Contact;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContact {
  public static void main(String[] args) throws IOException {
    Contact contact = new Contact("Petia", "0634545915");

    File file = new File("/home/amakogon/contacts");
    System.out.println(file.createNewFile());

    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(file, true));
      writer.write(contact.toString());
      writer.newLine();
    } finally {
      if (writer != null) {
        writer.close();
      }
    }


  }
}
