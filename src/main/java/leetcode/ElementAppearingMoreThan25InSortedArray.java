package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        int N = arr.length / 4;
        for (int x : arr) {
            counts.put(x, counts.getOrDefault(x, 0) + 1);
            if (counts.get(x) > N) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ElementAppearingMoreThan25InSortedArray()
                                   .findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }
}
