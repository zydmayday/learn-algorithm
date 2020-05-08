package leetcode.cn.tree.subtree_of_another_tree;

import leetcode.cn.tree.TreeNode;

public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        return f(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean f(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val == t.val) return f(s.left, t.left) && f(s.right, t.right);
        return false;
    }
}
