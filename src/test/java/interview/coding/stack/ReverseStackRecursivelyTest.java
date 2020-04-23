package interview.coding.stack;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;

import static interview.coding.stack.ReverseStackRecursively.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStackRecursivelyTest {

    @Test
    void test() {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals(stack, reverse(reverse(stack)));
    }

    @Test
    void testSocket() {
        try {
            new Socket("localhost", 23);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
