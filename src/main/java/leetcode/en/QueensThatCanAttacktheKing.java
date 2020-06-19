package leetcode.en;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.StrictMath.abs;

// https://leetcode.com/problems/queens-that-can-attack-the-king/
public class QueensThatCanAttacktheKing {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] queen : queens) {
            int deltaX = queen[0] - king[0];
            int deltaY = queen[1] - king[1];
            if (deltaX == 0 || deltaY == 0 || abs(deltaX) == abs(deltaY)) {
                int key = 2 * (deltaX != 0 ? deltaX / abs(deltaX) : 0) + 3 * (deltaY != 0 ? deltaY / abs(deltaY) : 0);
                int[] prevQueue = map.getOrDefault(key, null);
                if (prevQueue == null || distance(prevQueue, king) > distance(queen, king)) {
                    map.put(key, queen);
                }
            }
        }
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getValue()[0]);
            temp.add(entry.getValue()[1]);
            res.add(temp);
        }
        return res;
    }

    private double distance(int[] a, int[] b) {
        return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
    }
}
