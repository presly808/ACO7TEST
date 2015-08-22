package collections.impl;

import collections.IList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyList<T> implements IList<T> {

  private static final int DEFAULT_SIZE = 16;
  private T[] elements;
  private int size;

  public MyList() {
    this(DEFAULT_SIZE);
  }

  public MyList(int size) {
    elements = (T[]) new Object[size];
  }

  @Override
  public boolean add(T obj) {
    ensureCapacity();
    elements[size++] = obj;
    return true;
  }

  @Override
  public void clear() {
//TODO: implement this
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean add(T t, int index) {
    checkIndex(index);
    ensureCapacity();


    //TODO: don't create new array. Use 1 System.arraycopy();
    T[] array = (T[]) new Object[elements.length];
    System.arraycopy(elements, 0, array, 0, index);
    array[index] = t;
    System.arraycopy(elements, index, array, index + 1, size() - index);
    elements = array;
    size++;

    return true;
  }

  private void ensureCapacity() {
    if (size() >= elements.length) {
      elements = Arrays.copyOf(elements, elements.length * 2);
    }
  }

  private void checkIndex(int index) {
    if (index < 0 || index > size() - 1) {
      //what to do?
//      IllegalArgumentException exception = new IllegalArgumentException(String.valueOf(index));
//      throw exception;
      throw new IllegalArgumentException("incorrect index: " + index);
    }
  }

  @Override
  public boolean remove(T obj) {
    for (int i = 0; i < size(); i++) {
      if (Objects.equals(elements[i], obj)) {
        return remove(i);
      }
    }

    return false;
  }

  @Override
  public boolean remove(int index) {
    if (index == size() - 1) {
      elements[index] = null;
    } else {
      System.arraycopy(elements, index + 1, elements, index, size() - index + 1);
    }
    size--;
    return true;
  }

  @Override
  public T get(int index) {
    checkIndex(index);
    return elements[index];
  }

  @Override
  public boolean contains(T obj) {
    for (int i = 0; i < size(); i++) {
      if (Objects.equals(elements[i], obj)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("[");
    for (int i = 0; i < size() - 1; i++) {
      builder.append(elements[i]).append(", ");
    }
    builder.append(elements[size() - 1]).append("]");
    return builder.toString();
  }

  @Override
  public Iterator<T> iterator() {
    return new MyListIterator();
  }

  private class MyListIterator implements Iterator<T> {

    private int index;

    @Override
    public boolean hasNext() {
      return elements[index] != null;
    }

    @Override
    public T next() {
      return elements[index++];
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
