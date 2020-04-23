package interview.coding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用两个栈实现队列
 * @param <T> 栈元素类型
 */
public class TwoStackQueue<T> {

    private Deque<T> stack1 = new ArrayDeque<>();
    private Deque<T> stack2 = new ArrayDeque<>();

    private void moveStack(Deque<T> stack1, Deque<T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public void add(T item) {
        moveStack(stack2, stack1);
        stack1.push(item);
    }

    public T poll() {
        moveStack(stack1, stack2);
        return stack2.pop();
    }

    public T peek() {
        moveStack(stack1, stack2);
        return stack2.peek();
    }

}
