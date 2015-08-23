package week6.day2;

import week1.contact.Contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ParseContacts {
  public static void main(String[] args) throws IOException {
    File file = new File("/home/amakogon/contacts");
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));

      String line = reader.readLine();
      String contactInfo = line.substring(line.indexOf('{') + 1, line.lastIndexOf("}"));
      System.out.println(contactInfo);

      Contact contact = parse(contactInfo);
      System.out.println("Parsed contact = " + contact);

    } catch (ParseContactException e) {
      e.printStackTrace();
    } finally {
      reader.close();
    }
  }

  public static Contact parse(String data) throws ParseContactException {
    String[] parts = data.split(",");
    Contact contact = new Contact();
    for (String part : parts) {
      String[] fields = part.trim().split("=");
      //key=value
      //name=Andrew
      String key = fields[0];
      String value = fields[1];

      if (Objects.equals(key, "name")) {
        contact.setName(value);
      } else if (Objects.equals(key, "phone")) {
        contact.setPhone(value);
      } else if (Objects.equals(key, "age")) {
        contact.setAge(Integer.parseInt(value));
      }
    }
    return contact;
  }
}
