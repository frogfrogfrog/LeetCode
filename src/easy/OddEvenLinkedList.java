package easy;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        ListNode odd = head, even = head.next;
        ListNode evenHead = even;
        ListNode cur = head.next.next;
        boolean isOdd = true;
        while (cur != null) {
            if (isOdd) {
                odd.next = cur;
                odd = cur;
                cur = cur.next;
                isOdd = false;
            } else {
                even.next = cur;
                even = cur;
                cur = cur.next;
                isOdd = true;
            }
        }
        even.next = null;
        odd.next = evenHead;
        return head;
    }
}
