package collections;

public interface IList<T> extends ICollection<T>{

  boolean add(T obj, int index);

  boolean remove(int index);

  T get(int index);

}
