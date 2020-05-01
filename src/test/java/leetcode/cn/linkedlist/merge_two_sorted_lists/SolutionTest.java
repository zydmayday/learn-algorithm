package leetcode.cn.linkedlist.merge_two_sorted_lists;

import leetcode.cn.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;


        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;



        Solution solution = new Solution();
        ListNode ans = solution.mergeTwoListsRecur(l11, l21);
        int i = 0;
        int[] expected = new int[]{1, 1, 2, 3, 4, 4};
        while (ans != null) {
            assertEquals(expected[i++], ans.val);
            ans = ans.next;
        }
    }

    @Test
    void test2() {
        ListNode l11 = new ListNode(1);


        Solution solution = new Solution();
        ListNode ans = solution.mergeTwoLists(l11, null);
        int i = 0;
        int[] expected = new int[]{1};
        while (ans != null) {
            assertEquals(expected[i++], ans.val);
            ans = ans.next;
        }
    }
}
