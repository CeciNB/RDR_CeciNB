package dk.kea.assignment;

import dk.kea.util.INode;
import dk.kea.util.IQueue;
import java.util.Iterator;

public class DuckQueue implements Iterable<Duck>, IQueue {
    private int length;
    private Duck duck;
    private Duck front;
    private Duck rear;

    public DuckQueue() {
        length = 0;
        front = null;
    }

    @Override
    public void enqueue(int data) {
        this.duck = new Duck(data);
        if (isEmpty()) {
            front = duck;
        } else {
            rear.setNext(duck);
        }
        rear = duck;
        length++;
    }

    @Override
    public int dequeue() throws Exception {
        int result;
        if (isEmpty()) {
            throw new Exception("Can't - Empty queue");
        } else {
            result = front.getData();
            front = front.getNext();
            length--;
        }
        return result;
    }

    @Override
    public int first() throws Exception {
        if (isEmpty()) {
            throw new Exception("No First - Empty queue");
        }
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "{ }";
        }
        StringBuilder sb = new StringBuilder();
        INode<Duck> next = front;
        sb.append(next.getData());
        next = next.getNext();
        while(next != null){
            sb.append(", ").append(next.getData());
            next = next.getNext();
        }

        return "{" + sb.toString() + "}";
    }

    @Override
    public Iterator<Duck> iterator() {
        return this.iterator();
    }

}
