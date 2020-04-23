package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/palindrome-partitioning-ii/
// hard
public class PalindromePartitioningII {

    int[] cuts;

    public int minCut(String s) {
        int n = s.length();
        cuts = new int[n + 1];
        // init cuts and suppose that we should cuts as much as possible
        for (int i = 0; i <= n; i++) cuts[i] = i;
        for (int i = 0; i < n; i++) {
            // odd
            // example
            // when i = some number, j start from 0
            // [...,x,x,x,x,x,x,x,x,x...]
            // focus on [..., prev,x, (y), next,x,x,x,x,]
            // 1. we first check (x), of course is true, then we continue
            // focus on [...,prev,(z1,y,z2),next,x,x,x,x]
            // 2. if z1 == z2, continue again
            // focus on [...,prev, (m, z1, y, z2, n), next, ...]
            // 3. if m != n, then for-loop should be over
            // turn back to step 2 and see what happened
            // i + j + 1 -> next item of z2, because i point to y and j = 1
            // so for next, we already know (z1, y, z2) is palindrome, so we don't need to cut in them,
            // cuts[i - j] points to prev, we also know that the optimized value until prev is cuts[i - j]
            // so to minimize cuts[i + j + 1], what we need to do is just cut between (prev, z1) -> 1 + cuts[i - j]
            for (int j = 0; i - j >= 0 && i + j < n && s.charAt(i + j) == s.charAt(i - j); j++) {
                cuts[i + j + 1] = Math.min(cuts[i + j + 1], 1 + cuts[i - j]);
            }
            // even
            for (int j = 1; i - j + 1 >= 0 && i + j < n && s.charAt(i - j + 1) == s.charAt(i + j); j++) {
                cuts[i + j + 1] = Math.min(cuts[i + j + 1], 1 + cuts[i - j + 1]);
            }
            System.out.println(Arrays.toString(cuts));
        }
        return cuts[n];
    }

    public static void main(String[] args) {
        PalindromePartitioningII s = new PalindromePartitioningII();
//        System.out.println(s.minCut("aab"));
//        System.out.println(s.minCut(
//                "apjesgpsxoeiokmqmfgvjslcjukbqxpsobyhjpbgdfruqdkeiszrlmtwgfxyfostpqczidfljwfbbrflkgdvtytbgqalguewnhvvmcgxboycffopmtmhtfizxkmeftcucxpobxmelmjtuzigsxnncxpaibgpuijwhankxbplpyejxmrrjgeoevqozwdtgospohznkoyzocjlracchjqnggbfeebmuvbicbvmpuleywrpzwsihivnrwtxcukwplgtobhgxukwrdlszfaiqxwjvrgxnsveedxseeyeykarqnjrtlaliyudpacctzizcftjlunlgnfwcqqxcqikocqffsjyurzwysfjmswvhbrmshjuzsgpwyubtfbnwajuvrfhlccvfwhxfqthkcwhatktymgxostjlztwdxritygbrbibdgkezvzajizxasjnrcjwzdfvdnwwqeyumkamhzoqhnqjfzwzbixclcxqrtniznemxeahfozp"));
        System.out.println(s.minCut(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}