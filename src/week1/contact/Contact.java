package week1.contact;

public class Contact {

  String name;
  String phone;
  int age;

  @Override
  public String toString() {
    return "Contact{" +
      "name='" + name + '\'' +
      ", phone='" + phone + '\'' +
      ", age=" + age +
      '}';
  }

  public void showInfo() {
    System.out.println(name + "," + phone + "," + age);
  }
}
