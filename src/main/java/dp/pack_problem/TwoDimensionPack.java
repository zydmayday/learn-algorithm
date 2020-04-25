package dp.pack_problem;

//二维背包问题
//对于一件物品，有两个不同费用，想要使用这个物品必须同时支付这两种费用。
//每种费用都有一个最大值

import static java.lang.Integer.max;

//基本上思路也是差不多的
public class TwoDimensionPack {

    public int solutionZeroOne(int[] C, int[] D, int[] W, int V, int U) {
        int[][] F = new int[V + 1][U + 1];

        for (int i = 0; i < C.length; i++) {
            int c = C[i];
            int d = D[i];
            int w = W[i];
            zeroOne(F, c, d, w, V, U);
        }

        return F[V][U];
    }

    public int solutionComplete(int[] C, int[] D, int[] W, int V, int U) {
        int[][] F = new int[V + 1][U + 1];

        for (int i = 0; i < C.length; i++) {
            int c = C[i];
            int d = D[i];
            int w = W[i];
            complete(F, c, d, w, V, U);
        }
        return F[V][U];
    }

    private void zeroOne(int[][] F, int c, int d, int w, int V, int U) {
        for (int v = V; v >= c; v--) {
            for (int u = U; u >= d; u--) {
                F[v][u] = max(F[v][u], F[v - c][u - d] + w);
            }
        }
    }

    private void complete(int[][] F, int c, int d, int w, int V, int U) {
        for (int v = c; v <= V; v++) {
            for (int u = d; u <= U; u++) {
                F[v][u] = max(F[v][u], F[v - c][u - d] + w);
            }
        }
    }
}
