package dp.pack_problem;

//问题描述
//有N件物品和容量为V的背包。
//放入第i件物品消耗的费用为Ci，
//得到的价值为Wi，
//问将哪些物品放入背包后价值总和最大

//每个只能放一次

// f(i, v) = max(f(i - 1, v), f(i - 1, v - Ci) + Wi)

import java.util.Arrays;

import static java.lang.Integer.max;

public class ZeroOnePack {

    /**
     * 最基本的想法，两次遍历，不优化
     * 时间复杂度：O(VN)
     * 空间复杂度：O(VN)
     *
     * @param C 每件物品的cost
     * @param W 每件物品的价值
     * @param V 承受的总cost
     * @return
     */
    public int solution1(int[] C, int[] W, int V) {
        int[][] F = new int[C.length + 1][V + 1];
        for (int i = 1; i <= C.length; i++) {
            int c = C[i - 1];
            int w = W[i - 1];
            for (int v = c; v <= V; v++) {
                F[i][v] = max(F[i - 1][v], F[i - 1][v - c] + w);
            }
        }
        System.out.println(Arrays.deepToString(F));
        return F[C.length][V];
    }

    /**
     * 可以这么理解这个问题
     * 第i次开始循环的时候，i-1已经最优
     * 1. 要不然我不拿
     * 2. 第i次我拿，那么剩下来的总数，即F[V - Ci] + Wi就是我能获得到的最高值
     * 从1和2中选择更高的进行存储
     *
     * @param C
     * @param W
     * @param V
     * @return
     */
    public int solution2(int[] C, int[] W, int V) {
        int[] F = new int[V + 1];
        int[] G = new int[C.length]; // 记录选择
        for (int i = 0; i < C.length; i++) {
            for (int v = V; v >= C[i]; v--) {
                int prev = F[v];
                F[v] = max(prev, F[v - C[i]] + W[i]);
                if (prev == F[v]) G[i] = 0;
                else G[i] = 1;
            }
        }
        System.out.println(Arrays.toString(G));
        return F[V];
    }

    public void single(int[] F, int C, int W, int V) {
        for (int v = V; v >= C; v--) {
            F[v] = max(F[v], F[v - C] + W);
        }
    }

}
