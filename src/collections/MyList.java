package collections;

import java.util.Arrays;
import java.util.Objects;

public class MyList implements IList {

  private static final int DEFAULT_SIZE = 16;
  private Object[] elements;
  private int size;

  public MyList() {
    this(DEFAULT_SIZE);
  }

  public MyList(int size) {
    elements = new Object[size];
  }

  @Override
  public boolean add(Object obj) {
    ensureCapacity();
    elements[size++] = obj;
    return true;
  }

  @Override
  public boolean add(Object obj, int index) {
    checkIndex(index);
    ensureCapacity();

    Object[] array = new Object[elements.length];
    System.arraycopy(elements, 0, array, 0, index);
    array[index] = obj;
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
    }
  }

  @Override
  public Object remove(Object obj) {
    for (int i = 0; i < size(); i++) {
      if (Objects.equals(elements[i], obj)) {
        return remove(i);
      }
    }

    return null;
  }

  @Override
  public Object remove(int index) {
    Object removed = get(index);
    if (index == size() - 1) {
      elements[index] = null;
    } else {
      System.arraycopy(elements, index + 1, elements, index, size() - index + 1);
    }
    size--;
    return removed;
  }

  @Override
  public Object get(int index) {
    checkIndex(index);
    return elements[index];
  }

  @Override
  public boolean contains(Object obj) {
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
}
