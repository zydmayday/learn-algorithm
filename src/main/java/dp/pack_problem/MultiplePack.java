package dp.pack_problem;

//这个是完全背包问题的进化版，
//每个物品可取用的次数为Mi，求最优解

//可以写出下述的状态转移方程
//F[i, v] = max(F[i - 1, v - k*Ci] + k*Wi | 0<=k<=Mi)
public class MultiplePack {

    private final ZeroOnePack zeroOnePack = new ZeroOnePack();
    private final CompletePack completePack  = new CompletePack();


    /*
     这个问题可以进而转化为01背包问题和完全背包问题
     如果对于第i件物品，我们可用的数量超过了需要的数量，即C * M >= V，那么对于这个物品此问题转化成了完全背包问题
     否则，我们需要用01背包的思路来优化这个算法
     一个简单的想法是我们将第i件物品拆分成Mi件单独的物品，对这Mi件物品我们采用01背包的方式可以求解。
     优化，利用二进制的思想。
     例如，如果Mi等于20的情况，我们可以分解成1,2,4,8,5这五个值进行求解。
     其实主要的思想在于我们用1,2,4,8就足够cover到0 ~ Mi中的任意一个情况。
     */
    public int solution1(int[] C, int[] W, int[] M, int V) {
        int[] F = new int[V + 1];
        for (int i = 0; i < C.length; i++) {
            single(F, C[i], W[i], M[i], V);
        }
        return F[V];
    }

    public void single(int[] F, int C, int W, int M, int V) {
        if (C * M >= V) {
            completePack.single(F, C, W, V);
        } else {
            int k = 1;
            while (k < M) {
                zeroOnePack.single(F, k * C, k * W, V);
                M -= k;
                k *= 2;
            }
            zeroOnePack.single(F, C * M, W * M, V);
        }
    }

}
