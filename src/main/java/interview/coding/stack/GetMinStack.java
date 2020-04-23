package interview.coding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 实现一个栈，可以O(1)取得min元素
 */
public class GetMinStack {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> stackMin = new ArrayDeque<>();

    public Integer pop() {
        int num = stack.pop();
        if (num == getMin()) {
            stackMin.pop();
        }
        return num;
    }

    public void push(Integer item) {
        if (stackMin.isEmpty() || item <= getMin()) {
            stackMin.push(item);
        }
        stack.push(item);
    }

    public Integer getMin() {
        return stackMin.peek();
    }
}
