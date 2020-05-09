package leetcode.cn.maximal_square;

import static java.lang.Math.*;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = f(matrix, i, j);
                ans = max(ans, matrix[i][j] - '0');
            }
        }
        return ans;
    }

    private char f(char[][] m, int i, int j) {
        if (i == 0 || j == 0 || m[i][j] == '0') return m[i][j];
        int a = m[i - 1][j - 1] - '0';
        int b = m[i][j - 1] - '0';
        int c = m[i - 1][j] - '0';
        a = min(a, min(b, c));
        return (char) (pow(pow(a, 0.5) + 1, 2) + '0');
    }
}
