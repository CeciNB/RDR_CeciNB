package dk.kea.testsubjects;

import dk.kea.util.INode;

public class Node implements INode<Node> {
    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public Node getNext() {
        return nextNode;
    }
    @Override
    public void setNext(Node next) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{"+ data +"}";
    }
}
