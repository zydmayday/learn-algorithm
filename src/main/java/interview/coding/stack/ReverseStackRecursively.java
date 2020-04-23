package interview.coding.stack;

import java.util.Deque;

/**
 * 仅利用递归和栈操作逆序一个栈
 */
public class ReverseStackRecursively {

    public static <T> Deque<T> reverse(Deque<T> stack) {
        if (stack.isEmpty()) {
            return stack;
        } else {
            T last = getAndRemoveLast(stack);
            reverse(stack);
            stack.push(last);
        }
        return stack;
    }

    private static <T> T getAndRemoveLast(Deque<T> stack) {
        T item = stack.pop();
        if (stack.isEmpty()) {
            return item;
        } else {
            T last = getAndRemoveLast(stack);
            stack.push(item);
            return last;
        }
    }
}
