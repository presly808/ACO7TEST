package collections.impl;

import collections.IList;

import java.util.Iterator;
import java.util.Objects;

public class MyLinkedList<E> implements IList<E> {

  private Node<E> head;
  private Node<E> tail;
  private int size;

  @Override
  public boolean add(E obj, int index) {
    return false;
  }

  @Override
  public boolean remove(int index) {
    return false;
  }

  @Override
  public E get(int index) {
    return null;
  }

  @Override
  public boolean add(E e) {
    if (isEmpty()) {
      head = new Node<E>(e, null, null);
      tail = head;
      size++;
      return true;
    }
    Node<E> node = new Node<E>(e, null, tail);
    tail.next = node;
    tail = node;
    size++;
    return true;
  }

  @Override
  public void clear() {

  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean remove(E e) {
    Node<E> node = node(e);
    if (node == null) {
      return false;
    }

    //TODO:
    //1) remove head
//    2) remove tail
//    3) remove middle

    return true;
  }

  private Node<E> node(E e) {
    for (Node<E> start = head; start != null; start = start.next) {
      if (Objects.equals(start.elem, e)) {
        return start;
      }
    }
    return null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean contains(E e) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  private static class Node<E> {
    E elem;
    Node<E> next;
    Node<E> prev;

    private Node(E elem, Node next, Node prev) {
      this.next = next;
      this.prev = prev;
      this.elem = elem;
    }
  }
}
