package interview.coding.stack;

import java.util.LinkedList;

public class MaxWindow {

    // 当前最大值是不是已经超过window范围，超过的话直接删除
    // 获得到当前的合法的最大值
    // 新的index先查看是否大于当前最大值
    // 是的话就插入
    public int[] execute(int[] nums, int w) {

        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - w + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peekFirst() <= (i - w)) {
                queue.pollFirst();
            }
            if (queue.isEmpty()) {
                queue.addFirst(i);
            } else {
                if (nums[queue.peekFirst()] < nums[i]) {
                    queue.addFirst(i);
                } else {
                    queue.addLast(i);
                }
            }
            if (index >= i - w + 1 && i - w + 1 >= 0) {
                res[index++] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
