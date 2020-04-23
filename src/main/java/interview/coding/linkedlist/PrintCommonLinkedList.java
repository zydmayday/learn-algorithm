package interview.coding.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintCommonLinkedList<T extends Comparable<T>> {

    private LinkedList<T> head1;
    private LinkedList<T> head2;

    public PrintCommonLinkedList(LinkedList<T> head1, LinkedList<T> head2) {
        this.head1 = head1;
        this.head2 = head2;
    }


    public LinkedList<T> print() {
        Iterator<T> iter1 = head1.iterator();
        Iterator<T> iter2 = head2.iterator();
        LinkedList<T> res = new LinkedList<>();
        T v1 = iter1.hasNext() ? iter1.next() : null;
        T v2 = iter2.hasNext() ? iter2.next() : null;
        while (v1 != null && v2 != null) {
            if (v1.compareTo(v2) > 0) {
                v2 = iter2.hasNext() ? iter2.next() : null;
            } else if (v1.compareTo(v2) < 0) {
                v1 = iter1.hasNext() ? iter1.next() : null;
            } else {
                res.add(v2);
                v1 = iter1.hasNext() ? iter1.next() : null;
                v2 = iter2.hasNext() ? iter2.next() : null;
            }
        }
        return res;
    }
}
