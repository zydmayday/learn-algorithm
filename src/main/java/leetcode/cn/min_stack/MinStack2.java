package leetcode.cn.min_stack;

import static java.lang.Integer.min;

public class MinStack2 {

    class Node {
        int value;
        int min;
        Node next;

        Node(int v, int m) {
            value = v;
            min = m;
        }
    }

    private Node head;

    public MinStack2() {
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            Node next = new Node(x, min(head.min, x));
            next.next = head;
            head = next;
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
}
