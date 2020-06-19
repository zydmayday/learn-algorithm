package leetcode.cn.contains_duplicate_ii;

import leetcode.cn.contains_deplicate_ii.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        assertTrue(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(s.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
