package leetcode.en;

import java.util.*;

// https://leetcode.com/problems/path-with-maximum-gold/
public class PathWithMaximumGold {

    private int res = 0;
    private int R;
    private int C;
    private int[][] G;

    class Cell {
        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
            this.val = isLegal() ? G[row][col] : 0;
        }

        int row;
        int col;
        int val;

        public int getVal() {
            return val;
        }

        public boolean isLegal() {
            return row >= 0 && row < R && col >= 0 && col < C;
        }

        public Cell leftCell() {
            return new Cell(row, col - 1);
        }

        public Cell rightCell() {
            return new Cell(row, col + 1);
        }

        public Cell upCell() {
            return new Cell(row - 1, col);
        }

        public Cell downCell() {
            return new Cell(row + 1, col);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cell cell = (Cell) o;
            return row == cell.row &&
                    col == cell.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }

    private HashMap<Cell, Boolean> paths = new HashMap<>();

    public int getMaximumGold(int[][] grid) {
        if (grid.length == 0) return 0;
        G = grid;
        R = grid.length;
        C = grid[0].length;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                Cell cell = new Cell(row, col);
                backTracking(cell, 0);
            }
        }
        return res;
    }

    private void backTracking(Cell cell, int sum) {
        if (paths.getOrDefault(cell, false)) return; // bottleneck
        if (!cell.isLegal() || cell.getVal() == 0) {
            res = Math.max(res, sum);
        } else {
            paths.put(cell, true);
            sum += cell.getVal();
            Cell leftCell = cell.leftCell();
            backTracking(leftCell, sum);
            Cell rightCell = cell.rightCell();
            backTracking(rightCell, sum);
            Cell upCell = cell.upCell();
            backTracking(upCell, sum);
            Cell downCell = cell.downCell();
            backTracking(downCell, sum);
            paths.put(cell, false);
        }
    }

    public static void main(String[] args) {
        PathWithMaximumGold solution = new PathWithMaximumGold();
        int[][] grid = new int[][]{
                {1, 0, 7},
                {2, 0, 6},
                {3, 4, 5},
                {0, 3, 0},
                {9, 0, 20}};
        System.out.println(solution.getMaximumGold(grid));
    }
}
