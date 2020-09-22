package dk.kea.assignment;

import dk.kea.assignment.DuckQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DuckQueueTest {

    DuckQueue duckQueue;

    @BeforeEach
    void setUp() {
        duckQueue = new DuckQueue();
    }

    @Test
    void toStringOneTwo()
    {
        duckQueue.enqueue(1);
        duckQueue.enqueue(2);
        //Object i = q.dequeue();
        assertEquals("{1, 2}",duckQueue.toString());
    }

    @Test
    void toStringOneTwoThree()
    {
        duckQueue.enqueue(1);
        duckQueue.enqueue(2);
        duckQueue.enqueue(3);
        //Object i = q.dequeue();
        assertEquals("{1, 2, 3}",duckQueue.toString());
    }

    @Test
    public void isEmptyOnEmpty() {
        assertTrue(duckQueue.isEmpty());
    }

    @Test
    public void isEmptyOnFilled() {
        duckQueue.enqueue(7);
        assertFalse(duckQueue.isEmpty());
    }
    @Test
    public void enqueueOne() {
        duckQueue.enqueue(1);
        String actual = null;
        String expected = "No First - Empty queue";
        try {
            duckQueue.first();
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
            duckQueue.first();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }


    @Test
    public void dequeueOnFull() {
        duckQueue.enqueue(1);
        duckQueue.enqueue(2);
        String actual = null;
        String expected = "Can't - Empty queue";
        int result = 0;
        try {
            result = duckQueue.dequeue();
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
            duckQueue.dequeue();
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }

    @Test
    public void sizeEmpty() {
        assertEquals(0, duckQueue.size());
    }

    @Test
    public void sizeFull() {
        duckQueue.enqueue(1);
        duckQueue.enqueue(2);
        duckQueue.enqueue(1);
        duckQueue.enqueue(2);
        assertEquals(4, duckQueue.size());
    }
}