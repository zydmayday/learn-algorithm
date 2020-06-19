package leetcode.cn.tree.lowest_common_ancestor_of_a_binary_tree;

import leetcode.cn.tree.TreeNode;
import leetcode.cn.tree.Wrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, '[3,5,1,6,2,0,8,null,null,7,4]', 5, 1",
            "5, '[3,5,1,6,2,0,8,null,null,7,4]', 5, 4",
            "3, '[3,5,1,6,2,0,8,null,null,7,4]', 2, 0",
            "3, '[3,5,1,6,2,0,8,null,null,7,4]', 7, 8",
            "1, '[3,5,1,6,2,0,8,null,null,7,4]', 0, 8",
            "5, '[3,5,1,6,2,0,8,null,null,7,4]', 4, 6",
    })
    void test(int expected, String tree, int p, int q) {
        Solution solution = new Solution();
        TreeNode pTree = new TreeNode(p);
        TreeNode qTree = new TreeNode(q);
        TreeNode ans = solution.lowestCommonAncestor(Wrapper.stringToTreeNode(tree), pTree, qTree);
        assertEquals(expected, ans.val);
    }

    @Test
    void test2() {
        System.out.println("-2 = " + Integer.toBinaryString(-2));
        System.out.println("-2 >> 31 = " + Integer.toBinaryString(-2 >> 31));
        System.out.println("-2 ^ (-2 >> 31) = " + Integer.toBinaryString(-2 ^ (-2 >> 31)));
        System.out.println("(-2 ^ (-2 >> 31)) - (-2 >> 31) = " + Integer.toBinaryString((-2 ^ (-2 >> 31)) - (-2 >> 31)));
    }

    private int abs(int n) {
        return (n ^ (n >> 31)) - (n >> 31);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "0, 0",
            "1, -1",
            "2, -2",
    })
    void test3(int expected, int n) {
        assertEquals(expected, abs(n));
    }
}
