package SearchInsert;

public class ListNode {
    int data;
    ListNode back;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = null;
    }
}
