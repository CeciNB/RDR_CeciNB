package dk.kea.assignment;

import dk.kea.util.INode;

public class Duck implements INode<Duck> {
    private int data;
    private Duck nextDuck;

    public Duck(int data){
        this.data = data;
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public Duck getNext() {
        return nextDuck;
    }

    @Override
    public void setNext(Duck next) {
        this.nextDuck = next;
    }

    @Override
    public String toString() {
        return "Data{"+ data +"}";
    }
}
