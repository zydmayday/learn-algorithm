package leetcode.en;

// https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchA2DMatrixII {

    static int count = 0;

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1) return false;
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        SearchA2DMatrixII solution = new SearchA2DMatrixII();
        int[][] m = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(solution.searchMatrix(m, 14));
        System.out.println(count);
        System.out.println(m[3][0]);
    }
}
