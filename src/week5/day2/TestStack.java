package week5.day2;

import collections.IStack;
import collections.impl.MyStack;

public class TestStack {
  public static void main(String[] args) {
    IStack<Integer> stack = new MyStack<Integer>();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    Integer i1 = stack.pop();

    i1.equals(5);
  }
}
