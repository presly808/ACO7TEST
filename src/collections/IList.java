package collections;

public interface IList {
  boolean add(Object obj);

  boolean add(Object obj, int index);

  Object remove(Object obj);

  Object remove(int index);

  Object get(int index);

  boolean contains(Object obj);

  int size();

}
