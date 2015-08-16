package collections;

public interface IStack<E> extends ICollection<E> {

  E push(E e);

  E pop();

  E peek();
}
