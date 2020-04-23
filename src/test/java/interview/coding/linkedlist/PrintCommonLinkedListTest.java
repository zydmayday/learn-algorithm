package interview.coding.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintCommonLinkedListTest {

    @Test
    void test() {
        LinkedList<Integer> head1 = new LinkedList<>();
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        for (int num : arr1) {
            head1.add(num);
        }
        LinkedList<Integer> head2 = new LinkedList<>();
        int[] arr2 = new int[]{2, 3, 5, 6};
        for (int num : arr2) {
            head2.add(num);
        }
        PrintCommonLinkedList<Integer> list = new PrintCommonLinkedList<>(head1, head2);

        LinkedList<Integer> result = list.print();
        LinkedList<Integer> expected = new LinkedList<>();
        int[] expectedArr = new int[]{2, 3, 5};
        for (int num : expectedArr) {
            expected.add(num);
        }
        assertEquals(expected, result);
    }
}
