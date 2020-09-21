package dk.kea.testsubjects;

import dk.kea.testsubjects.NodeQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NodeQueueTest {

    NodeQueue nodeQueue;

    @BeforeEach
    void setUp() {
        nodeQueue = new NodeQueue();
    }

    @Test
    void toStringOneTwo()
    {
        NodeQueue q = new NodeQueue();
        q.enqueue(1);
        q.enqueue(2);
        //Object i = q.dequeue();
        assertEquals("Queue {1, 2}",q.toString());
    }

    @Test
    public void isEmptyOnEmpty() {
        assertTrue(nodeQueue.isEmpty());
    }

    @Test
    public void isEmptyOnFilled() {
        nodeQueue.enqueue(7);
        assertFalse(nodeQueue.isEmpty());
    }
    @Test
    public void enqueueOne() {
        nodeQueue.enqueue(1);
        String actual = null;
        String expected = "No First - Empty queue";
        try {
            nodeQueue.first();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertNotEquals(expected,actual);
    }

    @Test
    public void firstOnEmpty() {
        String actual = null;
        String expected = "No First - Empty queue";
        try {
            nodeQueue.first();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }


    @Test
    public void dequeueOnFull() {
        nodeQueue.enqueue(1);
        nodeQueue.enqueue(2);
        String actual = null;
        String expected = "Can't - Empty queue";
        int result = 0;
        try {
            result = nodeQueue.dequeue();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertNotEquals(expected,actual);
        assertEquals(1,result);
    }

    @Test
    public void dequeueOnEmpty() {
        String actual = null;
        String expected = "Can't - Empty queue";
        try {
            nodeQueue.dequeue();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }

    @Test
    public void sizeEmpty() {
        assertEquals(0, nodeQueue.size());
    }

    @Test
    public void sizeFull() {
        nodeQueue.enqueue(1);
        nodeQueue.enqueue(2);
        nodeQueue.enqueue(1);
        nodeQueue.enqueue(2);
        assertEquals(4, nodeQueue.size());
    }
}