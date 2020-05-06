package leetcode.cn.tree.validate_binary_search_tree;

import leetcode.cn.tree.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return f(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean f(TreeNode root, long min, long max) {
        if (root == null) return true;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) return min < root.val && root.val < max;
        return (left == null || (root.val > left.val && f(left, min, root.val)) ) &&
                (right == null || (root.val < right.val && f(right, root.val, max)));
    }
}
