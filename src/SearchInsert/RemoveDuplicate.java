package SearchInsert;

public class RemoveDuplicate {

    public ListNode head = null;
    public ListNode tail = null;

    public void addNode (int data)
    {
        ListNode newNode = new ListNode(data);
        if (head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.back=tail;
            tail=newNode;
        }
    }

    public ListNode removeDuplicates (ListNode head)
    {
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
