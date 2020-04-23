package interview.coding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

// 求最大子矩阵的大小
public class MaxSubMatrixStack {

    public int maxSub(int[][] matrix) {
        if (matrix.length < 1) return 0;
        int[] height = new int[matrix[0].length];
        int max = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < height.length; j++) {
                if (ints[j] == 1) {
                    height[j] = height[j] + 1;
                } else {
                    height[j] = 0;
                }
            }
            max = Math.max(max, maxAreaOf(height));
        }
        return max;
    }

    private int maxAreaOf(int[] height) {
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                int j = stack.pop();
                int k = stack.isEmpty() ? -1 : stack.peek();
                max = Math.max(max, height[j] * (i - k - 1));
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int i = stack.pop();
            int j = stack.isEmpty() ? -1 : stack.peek();
            max = Math.max(max, height[i] * (height.length - 1 - j));
        }
        return max;
    }
}
