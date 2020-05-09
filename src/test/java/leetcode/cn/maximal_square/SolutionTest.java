package leetcode.cn.maximal_square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        assertEquals(4, solution.maximalSquare(matrix));
        matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '1', '1', '1'}};
        assertEquals(9, solution.maximalSquare(matrix));
        matrix = new char[][]{
                {'1', '0'}};
        assertEquals(1, solution.maximalSquare(matrix));
        matrix = new char[][]{
                {'1', '1', '1', '0', '0', '0'},
                {'1', '1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1', '0'},
                {'1', '0', '1', '1', '1', '0'},
                {'1', '0', '1', '1', '1', '0'},
                {'1', '0', '1', '1', '1', '0'},
        };
        assertEquals(9, solution.maximalSquare(matrix));
    }
}
