package dp.pack_problem;

//有依赖的背包问题
//对于每个物品，要么是主键要么是附件，
//附件必须依赖组件才能存在。

import java.util.Arrays;

//对于每个主键，我们认为该主键就是一个组，
// 我们遍历他所有的附件的可能性，这些可能性就组合成了这个组的成员。
//那么对于每个合法的v，我们都可以从这个组中挑选出一些成员，满足最优解。
//所以对于每个组本身，我们使用01背包问题可以求解到最优解
//然后遍历每个组件，就可以求得全局的最优解
public class DependentPack {

    private ZeroOnePack zeroOnePack = new ZeroOnePack();

    // D表示依赖关系
    public int solution(int[] C, int[] W, int[][] D, int V) {
        int[] F = new int[V + 1];
        for (int i = 0; i < D.length; i++) {
            int Ck = C[i];
            grouped(F, C, W, D[i], V - Ck);
            // 计算完了之后，还是要把主键的数据给加上的
            for (int v = V; v >= Ck; v--) {
                F[v] = F[v - Ck] + W[i];
            }
        }
        return F[V];
    }

    //计算对每个组合中，对于每个v而言，各种搭配中最优的那个
    private void grouped(int[] F, int[] C, int[] W, int[] d, int V) {
        for (int i = 0; i < d.length; i++) {
            zeroOnePack.single(F, C[d[i]], W[d[i]], V);
        }
    }
}
