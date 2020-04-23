package leetcode;

// https://leetcode.com/problems/partition-array-into-disjoint-intervals/
public class PatitionArrayIntoDisjointIntervals {

    public int partitionDisjoint(int[] A) {
        int curMax = A[0];
        int pivot = 0;
        int totalMax = curMax;
        for (int i = 1; i < A.length; i++) {
            if (curMax > A[i]) {
                pivot = i;
                curMax = totalMax;
            } else {
                totalMax = Math.max(totalMax, A[i]);
            }
        }
        return pivot + 1;
    }
}
