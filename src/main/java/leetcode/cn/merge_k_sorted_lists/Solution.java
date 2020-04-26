package leetcode.cn.merge_k_sorted_lists;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.val));
        for (ListNode node : lists) {
            while (node != null) {
                pq.add(node);
                node = node.next;
            }
        }
        ListNode ans = pq.isEmpty() ? null : pq.poll();
        ListNode head = ans;
        while (!pq.isEmpty()) {
            head.next = pq.poll();
            head = head.next;
        }
        if (head != null) head.next = null;
        return ans;
    }
}
