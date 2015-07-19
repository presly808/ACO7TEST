package week2.day1;

public class TestContact {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.setName("Friend");
    dog1.setBreed("Shpits");
    dog1.setAge(3);
    System.out.println(dog1.asString());

    Dog dog2 = new Dog();
    dog2.setName("Tuzik");
    dog2.setBreed("NoName");
    dog2.setAge(9);
    System.out.println(dog2.asString());
    dog2.bark();

    Dog dog3 = new Dog();
    dog3.setName("Kolia");
    dog3.setAge(-130);

    System.out.println(dog3.asString());


  }
}
