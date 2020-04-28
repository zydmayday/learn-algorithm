package leetcode.cn.search_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, solution.search(new int[]{}, 3));
        assertEquals(1, solution.search(new int[]{1, 3}, 3));
        assertEquals(1, solution.search(new int[]{3, 1}, 1));
    }
}
