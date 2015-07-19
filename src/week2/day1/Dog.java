package week2.day1;

public class Dog {
  private String breed;
  private String name;
  private int age;

  public void bark() {
    System.out.println("Gav gav");
  }

  public String asString() {
    return "Name=" + name + ", breed=" + breed + ", age=" + age;
  }

  public void setAge(int dogAge) {
    if (dogAge > 0) {
      age = dogAge;
    }
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setBreed(String dogBreed) {
    breed = dogBreed;
  }

  public String getBreed() {
    return breed;
  }
}
