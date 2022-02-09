package data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    public void givenCircularBuffer_whenOfferOne_thenSizeIsOne() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>();

        buffer.offer(1);
        assertEquals(1, buffer.size());
    }

    @Test
    public void givenCircularBufferOfCapacityTwo_whenOfferTwo_thenFull() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(2);

        buffer.offer(1);
        buffer.offer(2);
        assertTrue(buffer.isFull());
    }

    @Test
    public void givenCircularBuffer_whenPollOne_thenGetThatValue() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(2);

        buffer.offer(1);
        assertEquals(1, buffer.poll());
    }

    @Test
    public void givenCircularBuffer_whenEmpty_thenPollReturnNull() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(2);

        assertNull(buffer.poll());
    }
}
