package dk.kea.util;

public interface INode<T> {
    public int getData();

    public T getNext();

    public void setNext(T next);
}
