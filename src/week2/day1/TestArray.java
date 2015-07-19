package week2.day1;

import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    int[] mas1 = {1, 2, 3, 4, 5};

    int[] mas2 = mas1;
    System.out.println("Before");
    printArray(mas1);
    printArray(mas2);

    mas2[0] = 16;
    System.out.println("After");
    printArray(mas1);
    printArray(mas2);

    System.out.println("After bad method");
    badMethod(mas2);
    printArray(mas1);
    printArray(mas2);
  }

  public static void badMethod(int[] nums) {
    nums[0] = 8888;
  }

  public static void printArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
