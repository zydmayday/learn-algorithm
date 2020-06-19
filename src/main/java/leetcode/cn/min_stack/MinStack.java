package leetcode.cn.min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> stackMin;

    public MinStack() {
        stack = new ArrayDeque<>();
        stackMin = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stackMin.isEmpty()) {
            stackMin.push(x);
        } else {
            if (stackMin.peek() >= x) {
                stackMin.push(x);
            }
        }
    }

    public void pop() {
        int n = stack.pop();
        if (!stackMin.isEmpty() && n == stackMin.peek()) {
            stackMin.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
