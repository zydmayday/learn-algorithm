package dp.pack_problem;

import static java.lang.Integer.max;

//分组背包问题
//前提条件和普通的背包问题类似
//不同的是我们要先将所有的物品划分成K组，
//且每组中的物品相互冲突，最多选一件。
//求最优值
public class GroupedPack {

    public int solution(int[] C, int[] W, int[][] G, int V) {
        int[] F = new int[V + 1];
        for (int[] g : G) {
            for (int v = V; v >= 0; v--) {
                grouped(F, C, W, g, v);
            }
        }
        return F[V];
    }

    private void grouped(int[] F, int[] C, int[] W, int[] G, int v) {
        for (int i = 0; i < G.length; i++) {
            int c = C[i];
            int w = W[i];
            if (c <= v) {
                F[v] = max(F[v], F[v - c] + w);
            }
        }
    }

    // 可以尝试对组进行优化，去掉一下不需要的数据
    private int[][] optimizeGroup(int[] C, int[] W, int[][] G, int V) {
        for (int[] g : G) {
            // 优化1：对同一组的物品，按照cost进行排序，移除掉相同cost但是价值更低的元素
            for (int i = 0; i < g.length; i++) {
                if (C[i] > V) {
                    // 优化2：remove item from group g.
                    // 如果cost已经大于可承受的最大范围，可以直接删除
                }

            }
        }
        return G;
    }
}
