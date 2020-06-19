package leetcode.en;

import java.util.Arrays;

// https://leetcode.com/problems/range-sum-query-2d-immutable/
public class RangeSumQuery2DImmutable {

    private int[][] dp;

//    public NumMatrix(int[][] matrix) {
//
//    }

    public RangeSumQuery2DImmutable(int[][] matrix) {
        if (matrix.length > 0) {
            dp = new int[matrix.length][matrix[0].length];
        }

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                if (i > 0) {
                    dp[i][j] = dp[i - 1][j] + sum;
                } else {
                    dp[i][j] = sum;
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int row3 = row1 - 1;
        int col3 = col1 - 1;
        return dp[row2][col2]
                + ((row3 >= 0 && col3 >= 0) ? dp[row3][col3] : 0)
                - (col3 >= 0 ? dp[row2][col3] : 0)
                - (row3 >= 0 ? dp[row3][col2] : 0);
    }

    public void printDp() {
        System.out.println(Arrays.deepToString(dp));
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        RangeSumQuery2DImmutable numMatrix = new RangeSumQuery2DImmutable(matrix);
        numMatrix.printDp();
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
        System.out.println(numMatrix.sumRegion(0, 2, 2, 4));

        matrix = new int[][]{};
        numMatrix = new RangeSumQuery2DImmutable(matrix);
    }
}
