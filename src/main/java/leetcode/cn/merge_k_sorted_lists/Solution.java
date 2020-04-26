package leetcode.cn.merge_k_sorted_lists;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    // 比暴力求解稍微好点 用到了优先队列
    // 其中时间复杂度为O(Nlogk)
    // N为最终链表的长度，k为初始链表的个数
    // 因为使用了优先队列，所以每次在比较节点的时候，开销为O(logk)
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

    public ListNode mergeKLists2(ListNode[] lists) {
        int interval = 1;
        int amount = lists.length;
        while(interval < amount) {
            for (int i = 0; i < amount - interval; i += interval * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return amount > 0 ? lists[0] : null;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                head.next = list2;
                list2 = list2.next;
            } else {
                head.next = list1;
                list1 = list1.next;
            }
            head = head.next;
        }
        if (list1 != null) {
            head.next = list1;
        } else {
            head.next = list2;
        }
        return ans.next;
    }
}
