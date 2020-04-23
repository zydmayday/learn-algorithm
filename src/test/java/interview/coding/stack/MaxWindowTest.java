package interview.coding.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxWindowTest {

    MaxWindow window = new MaxWindow();

    @Test
    void test() {
        int[] nums = new int[]{4, 3, 5, 4, 3, 3, 6, 7};
        assertArrayEquals(new int[]{4, 5, 5, 4, 3, 6, 7}, window.execute(nums, 2));
        assertArrayEquals(new int[]{5, 5, 5, 4, 6, 7}, window.execute(nums, 3));
        assertArrayEquals(new int[]{5, 5, 5, 6, 7}, window.execute(nums, 4));
    }
}
