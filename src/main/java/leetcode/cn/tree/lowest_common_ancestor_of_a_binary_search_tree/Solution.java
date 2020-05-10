package leetcode.cn.tree.lowest_common_ancestor_of_a_binary_search_tree;

import leetcode.cn.tree.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (root == null || root.val == p.val || root.val == q.val || root.val > p.val != root.val > q.val) ? root : lowestCommonAncestor(root.val > p.val ? root.left: root.right, p, q);
    }
}
