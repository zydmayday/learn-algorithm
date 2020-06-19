package leetcode.en;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisorGame {

    // 0: init
    // 1: win
    // 2: lose
    private int[] dp;

    public boolean divisorGame(int N) {
        dp = new int[N + 1];
        return choose(N);
    }

    private boolean choose(int N) {
        if (N == 1) return false;
        if (dp[N] != 0) return dp[N] == 1;
        for (int candi : candidatesOf(N)) {
            if (!choose(N - candi)) {
                dp[N] = 1;
                return true;
            }
        }
        dp[N] = 2;
        return false;
    }

    private List<Integer> candidatesOf(int n) {
        return IntStream.range(1, n / 2 + 1)
                        .filter(i -> n % i == 0)
                        .boxed()
                        .collect(Collectors.toList());
    }

}
