package leetcode.cn.merge_k_sorted_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        Solution solution = new Solution();
        ListNode[] lists = new ListNode[]{l11, l21, l3};
        ListNode ans = solution.mergeKLists(lists);
        int i = 0;
        int[] expected = new int[]{1, 1, 2, 3, 4, 4, 5, 6};
        while (ans != null) {
            assertEquals(expected[i++], ans.val);
            ans = ans.next;
        }
    }

    @Test
    void test2() {
        ListNode l11 = new ListNode(-2);
        ListNode l12 = new ListNode(-1);
        ListNode l13 = new ListNode(-1);
        ListNode l14 = new ListNode(-1);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        ListNode l21 = null;

        Solution solution = new Solution();
        ListNode[] lists = new ListNode[]{l11, l21};
        ListNode ans = solution.mergeKLists(lists);
        int i = 0;
        int[] expected = new int[]{-2, -1, -1, -1};
        while (ans != null) {
            assertEquals(expected[i++], ans.val);
            ans = ans.next;
        }
    }

    @Test
    void test3() {

        Solution solution = new Solution();
        ListNode[] lists = new ListNode[]{null};
        ListNode ans = solution.mergeKLists(lists);
        int i = 0;
        int[] expected = new int[]{};
        while (ans != null) {
            assertEquals(expected[i++], ans.val);
            ans = ans.next;
        }
    }
}
