package week1.contact;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();
    Scanner keyboard = new Scanner(System.in);
    printMenu();
    int choice = keyboard.nextInt();
    while (choice != 0) {
      doAction(choice, contactList);
      printMenu();
      choice = keyboard.nextInt();
    }

  }

  private static void doAction(int action, ContactList list) {
    Scanner scanner = new Scanner(System.in);
    switch (action) {
      case 1:
        Contact contact = new Contact("", "");
        System.out.println("Enter phone number");
      /*  contact.phone = scanner.next();
        System.out.println("Enter age");
        contact.age = scanner.nextInt();
        System.out.println("Enter name");
        contact.name = scanner.next();*/

        list.addContact(contact);
        break;
      case 2:
        list.showAll();
        break;
    }
  }


  private static void printMenu() {
    int number = 1;
    System.out.println("Input number to make a choice:");
    System.out.println(number++ + ". Add contact");
    System.out.println(number++ + ". Show all contacts");
    System.out.println("0. Exit");
  }
}
