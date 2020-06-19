package leetcode.cn.min_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        MinStack2 stack = new MinStack2();
        stack.push(-2);
        stack.push(0);
        stack.push(-1);
        assertEquals(-2, stack.getMin());
        assertEquals(-1, stack.top());
        stack.pop();
        assertEquals(-2, stack.getMin());
    }

    @Test
    void test2() {
        MinStack2 stack = new MinStack2();
        stack.push(0);
        stack.push(1);
        stack.push(0);
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
    }
}
