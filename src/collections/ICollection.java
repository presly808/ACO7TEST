package collections;

public interface ICollection<T> {
  boolean add(T t);

  void clear();

  boolean isEmpty();

  boolean remove(T t);

  int size();

  boolean contains(T t);
}
