package interview.coding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoStackQueueTest {

    TwoStackQueue<String> queue = new TwoStackQueue<>();

    @Test
    void test() {
        queue.add("a");
        queue.add("b");
        assertEquals("a", queue.peek());
        assertEquals("a", queue.poll());

        queue.add("c");
        assertEquals("b", queue.poll());
        assertEquals("c", queue.poll());
    }
}
