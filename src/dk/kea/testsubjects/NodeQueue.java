package dk.kea.testsubjects;

public class NodeQueue {
    private int length;
    private Node front;
    private Node rear;

    public NodeQueue(){
        length = 0;
        front = null;
        rear = null;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
        }else {
            rear.setNext(node);
        }
        rear = node;
        length++;
    }

    public int dequeue() throws Exception {
        int result;
        if (isEmpty()) {
            throw new Exception("Can't - Empty queue");
        }else {
            result = front.getData();
            front = front.getNext();
            length--;
        }
        return result;
    }

    public int first() throws Exception {
        if(isEmpty()){
            throw new Exception("No First - Empty queue");
        }
        return front.getData();
    }

    public  boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }

    @Override
    public String toString() {
        return "Queue {" + front.getData() + ", " + rear.getData() + "}";
    }
}
