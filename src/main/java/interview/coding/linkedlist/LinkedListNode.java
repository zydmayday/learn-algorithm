package interview.coding.linkedlist;

public class LinkedListNode<T> {

    private T val;
    private LinkedListNode<T> next;

    public LinkedListNode(T val, LinkedListNode<T> next) {
        this.val = val;
        this.next = next;
    }

    public LinkedListNode(T val) {
        this.val = val;
    }

    public LinkedListNode<T> next() {
        return next;
    }

    public void next(LinkedListNode<T> next) {
        this.next = next;
    }
}
