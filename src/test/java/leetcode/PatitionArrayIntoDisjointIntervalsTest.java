package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatitionArrayIntoDisjointIntervalsTest {

    @Test
    void test() {
        test(3, new int[]{5, 0, 3, 8, 6});
        test(4, new int[]{1, 1, 1, 0, 6, 12});
    }

    private void test(int expected, int[] input) {
        PatitionArrayIntoDisjointIntervals solution = new PatitionArrayIntoDisjointIntervals();
        assertEquals(expected, solution.partitionDisjoint(input));
    }
}
