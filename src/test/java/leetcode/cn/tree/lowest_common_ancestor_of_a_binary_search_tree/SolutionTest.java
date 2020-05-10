package leetcode.cn.tree.lowest_common_ancestor_of_a_binary_search_tree;

import leetcode.cn.tree.TreeNode;
import leetcode.cn.tree.Wrapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "6, '[6,2,8,0,4,7,9,null,null,3,5]', 2, 8",
            "2, '[6,2,8,0,4,7,9,null,null,3,5]', 2, 4",
            "6, '[6,2,8,0,4,7,9,null,null,3,5]', 2, 7",
            "6, '[6,2,8,0,4,7,9,null,null,3,5]', 4, 7",
            "2, '[6,2,8,0,4,7,9,null,null,3,5]', 0, 4",
            "2, '[6,2,8,0,4,7,9,null,null,3,5]', 0, 3",
            "4, '[6,2,8,0,4,7,9,null,null,3,5]', 3, 5",
    })
    void test(int expected, String tree, int p, int q) {
        Solution solution = new Solution();
        TreeNode pTree = new TreeNode(p);
        TreeNode qTree = new TreeNode(q);
        TreeNode ans = solution.lowestCommonAncestor(Wrapper.stringToTreeNode(tree), pTree, qTree);
        assertEquals(expected, ans.val);
    }
}
