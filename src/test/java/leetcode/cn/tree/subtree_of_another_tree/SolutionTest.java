package leetcode.cn.tree.subtree_of_another_tree;

import leetcode.cn.tree.TreeNode;
import leetcode.cn.tree.Wrapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "true, '[3,4,5,1,2]', '[4,1,2]'",
            "false, '[3,4,5,1,2,null,null,0]', '[4,1,2]'",
            "true, '[1,1]', '[1]'",
            "false, '[3,4,5,1,null,2]', '[3,1,2]'",
    })
    void test(boolean expected, String s, String t) {
        Solution solution = new Solution();
        TreeNode sTree = Wrapper.stringToTreeNode(s);
        TreeNode tTree = Wrapper.stringToTreeNode(t);
        assertEquals(expected, solution.isSubtree(sTree, tTree));
    }
}
