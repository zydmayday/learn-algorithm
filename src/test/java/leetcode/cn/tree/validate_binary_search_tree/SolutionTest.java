package leetcode.cn.tree.validate_binary_search_tree;

import leetcode.cn.tree.TreeNode;
import leetcode.cn.tree.Wrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "true, '[2,1,3]'",
            "false, '[5,1,4,null,null,3,6]'",
            "false, '[10,5,15,null,null,6,20]'",
            "false, '[1,1]'",
            "false, '[5,14,null,1]'",
            "true, '[2147483647]'",
    })
    void test(boolean expected, String input) {
        Solution solution = new Solution();
        TreeNode treeNode = Wrapper.stringToTreeNode(input);
        assertEquals(expected, solution.isValidBST(treeNode));
    }

    @Test
    void test2() {
        Wrapper.prettyPrintTree(Wrapper.stringToTreeNode("[10,5,15,null,null,6,20]"));
    }
}
