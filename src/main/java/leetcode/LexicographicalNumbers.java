package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/lexicographical-numbers/
public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int current = 1;
        for (int i = 0; i < n; i++) {
            res.add(current);
            current = next(current, n);
        }
        return res;
    }

    private int next(int current, int max) {
        int nextVal = current * 10;
        if (nextVal <= max) {
            return nextVal;
        }
        nextVal = current + 1;
        if (nextVal > max) {
            nextVal = current / 10 + 1;
        }
        while (nextVal % 10 == 0) {
            nextVal /= 10;
        }
        return nextVal;
    }

    public static boolean check(List<Integer> res) {
        return res.stream().distinct().collect(Collectors.toList()).equals(res);
    }

    public static void main(String[] args) {
        LexicographicalNumbers solution = new LexicographicalNumbers();
        int testNum = 19999;
        List<Integer> res = solution.lexicalOrder(testNum);
        boolean resBool = IntStream.range(1, testNum + 1)
                                   .mapToObj(solution::lexicalOrder)
                                   .allMatch(LexicographicalNumbers::check);
        System.out.println(resBool);
    }
}
