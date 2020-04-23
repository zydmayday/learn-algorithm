package interview.coding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ClosestMaxAndMinIndexStack {

    // 找出每个元素左边和右边最接近并且小于该元素的元素的index
    // 利用了单调栈结构
    public int[][] execute(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[][] res = new int[arr.length][2];
        for (int i = 0; i < arr.length;i++) {
            if (stack.isEmpty()) {
                res[i][0] = -1;
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    int j = stack.poll();
                    res[j][1] = i;
                }
                res[i][0] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res[stack.pop()][1] = -1;
        }
        return res;
    }
}
