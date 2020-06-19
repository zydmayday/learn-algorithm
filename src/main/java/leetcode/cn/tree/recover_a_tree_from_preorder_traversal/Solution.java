package leetcode.cn.tree.recover_a_tree_from_preorder_traversal;

import leetcode.cn.tree.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode recoverFromPreorder(String S) {
        if (S.isEmpty()) return null;
        char value = S.charAt(0);
        StringBuilder separator = new StringBuilder();
        for (int i = 1; i < S.length() && S.charAt(i) == '-'; i++) {
            separator.append('-');
        }
        StringBuilder left = new StringBuilder();
        for (int i = 1 + separator.length(); i < S.length(); i++) {
            if (S.charAt(i) != '-') left.append(S.charAt(i));
            else {
                if (S.charAt(i + separator.length()) != '-') {
                    break;
                } else {

                }
            }
        }
        String right = "";

        return new TreeNode(value, recoverFromPreorder(left.toString()), recoverFromPreorder(right));
    }

    public static void main(String[] args) {
        String s = "1-2--3--4-5--6--7";
        System.out.println(Arrays.toString(s.split("\\d-\\d")));

    }
}
