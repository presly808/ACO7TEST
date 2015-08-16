package week1.contact;

import collections.IList;
import collections.impl.MyList;

public class ContactList {
  IList contacts = new MyList();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void showAll() {
    for (int i = 0; i < contacts.size(); i++) {
//      Contact current = (Contact) contacts.get(i);
//      current.showInfo();
      System.out.println(contacts.get(i));
    }
  }

  public boolean removeLast() {
    return contacts.remove(contacts.size() - 1);
  }

  public Contact find(String keyWord) {
    return null;
  }
}
