package week1.contact;

public class ContactList {
  Contact[] contacts = new Contact[10];
  int freePlace;

  public void addContact(Contact contact) {
    contacts[freePlace] = contact;
    freePlace++;
  }

  public void showAll() {
    for (int i = 0; i < freePlace; i++) {
      Contact current = contacts[i];
      current.showInfo();
    }
  }

  public Contact removeLast(){
    freePlace--;
    Contact last = contacts[freePlace];
    contacts[freePlace] = null;
    return last;
  }

  public Contact find(String keyWord){
    return null;
  }
}
