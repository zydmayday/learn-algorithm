package dp.pack_problem;

import java.util.Arrays;

import static java.lang.Integer.max;

//完全背包问题
//和01背包问题很类似，只不过每个物品可以取超过一次

//两种解决这个问题的状态方程
//1. F[i, v] = max(F[i - 1, v - k * Ci] + k * Wi|0<=k*Ci<=V)
//2. F[i, v] = max(F[i - 1, v], F[i, v - Ci] + Wi)

//对于第一种方法，我们先找出第i件物品的所有可能性，取最大值，然后前往第i-1个物品

public class CompletePack {

    public int solution1(int[] C, int[] W, int V) {
        int[] F = new int[V + 1];
        int[][] G = new int[C.length][V + 1];
        for (int i = 0; i < C.length; i++) {
            for (int v = C[i]; v <= V; v++) {
                int prev = F[v];
                F[v] = max(F[v], F[v - C[i]] + W[i]);
                if (prev != F[v]) {
                    // 当我们使用了第i件物品的时候，
                    // 那么我们实际上就是使用了G[0-C.length][v - C[i]]时的选择，
                    // 再加上选择了第i件物品
                    for (int k = 0; k < G.length; k++) {
                        G[k][v] = G[k][v - C[i]];
                        if (k == i) G[k][v]++;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(G));
        // 最终选择的结果是G[0-C.length][v]
        for (int[] g : G) {
            System.out.print(g[g.length - 1]);
        }
        return F[V];
    }

    // 将每个背包的逻辑单独抽取出来
    public void single(int[] F, int c, int w, int V) {
        for (int v = c; v <= V; v++) {
            int prev = F[v];
            F[v] = max(prev, F[v - c] + w);
        }
    }

    public int solution2(int[] C, int[] W, int V) {
        int[] F = new int[V + 1];
        for (int i = 0; i < C.length; i++) {
            single(F, C[i], W[i], V);
        }
        return F[V];
    }
}
