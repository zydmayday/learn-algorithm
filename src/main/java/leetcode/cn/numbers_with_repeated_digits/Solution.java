package leetcode.cn.numbers_with_repeated_digits;

public class Solution {

    public int numDupDigitsAtMostN(int N) {
        char[] N_char = ("" + N).toCharArray();
        int n = N_char.length;
        int total = 0;
        for (int i = 1; i < n; i++) {
            total += 9 * A(9, i - 1);
        }
        boolean[] used = new boolean[10];
        for (int i = 0; i < n; i++) {
            int digit = N_char[i] - 48;
            for (int j = i == 0 ? 1 : 0; j < digit; j++) {
                if (used[j]) continue;
                total += A(9 - i, n - i - 1);
            }
            if (used[digit]) break;
            used[digit] = true;
            if (i == n - 1) total++;
        }
        return N - total;
    }

    public int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public int A(int m, int n) {
        return fact(m) / fact(m - n);
    }
}
