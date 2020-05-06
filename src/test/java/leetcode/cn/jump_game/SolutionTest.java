package leetcode.cn.jump_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
        assertTrue(solution.canJump(new int[]{2, 3, 1, 2, 0, 5}));
        assertTrue(solution.canJump(new int[]{2, 3, 1, 0, 4, 5}));
        assertFalse(solution.canJump(new int[]{2, 3, 1, 0, 0, 0}));
        assertTrue(solution.canJump(new int[]{2, 0, 0}));
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{4, 1, 1, 3, 1, 1, 1}));
    }
}
