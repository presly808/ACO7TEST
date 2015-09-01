package week1.contact;

import java.io.Serializable;

public class Contact implements Serializable{

  private String name;
  private String phone;
  private int age;

  public Contact() {
  }

  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

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
