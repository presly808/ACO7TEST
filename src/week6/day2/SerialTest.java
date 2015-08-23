package week6.day2;

import week1.contact.Contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/amakogon/serial"));
    Contact contact = new Contact("Oleg", "12312312");
    oos.writeObject(contact);

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/amakogon/serial"));
    Contact restored = (Contact) ois.readObject();
    System.out.println(restored);

  }
}
