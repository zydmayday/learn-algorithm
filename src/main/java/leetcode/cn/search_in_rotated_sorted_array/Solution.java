package leetcode.cn.search_in_rotated_sorted_array;

public class Solution {

    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        int N = nums.length;
        if (N == 0) return -1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (nums[mid] == target) return mid;
            if (nums[0] <= nums[mid]) {
                // 断点在右侧，因为从0到mid是恒增的
                if (target >= nums[0] && target <= nums[mid]) {
                    // 目标点在左边恒增的这一段范围内
                    tail = mid - 1;
                } else {
                    head = mid + 1;
                }
            } else {
                // 断点在mid的左侧，所以mid到N是恒增的
                if (target >= nums[mid] && target <= nums[N - 1]) {
                    // 目标点在右侧恒增的这一段
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                }
            }
        }
        return -1;
    }

}
