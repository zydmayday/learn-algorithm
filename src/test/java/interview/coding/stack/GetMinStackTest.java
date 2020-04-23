package interview.coding.stack;

import interview.coding.stack.GetMinStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetMinStackTest {

    private GetMinStack stack = new GetMinStack();

    @Test
    void test() {
        stack.push(1); // [1]
        stack.push(2); // [1, 2]
        assertEquals(2, stack.pop()); // [1]

        stack.push(3); // [1, 3]
        assertEquals(1, stack.getMin()); // 1

        assertEquals(3, stack.pop()); // [1]
        assertEquals(1, stack.getMin()); // 1
        assertEquals(1, stack.pop()); // []
    }
}
