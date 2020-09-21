package dk.kea.util;

public interface IQueue {

    public void enqueue(int data);

    public int dequeue() throws Exception;

    public int first() throws Exception;

    public  boolean isEmpty();

    public int size();
}
