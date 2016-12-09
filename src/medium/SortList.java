package medium;

public class SortList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l1.next = l2;
        l2.next = null;
        new SortList().sortList(l1);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMidNode(head);
        ListNode next = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(next);
        return mergeTwoList(left, right);
    }

    public ListNode getMidNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeTwoList(ListNode h1, ListNode h2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                cur.next = h1;
                h1 = h1.next;
            } else {
                cur.next = h2;
                h2 = h2.next;
            }
            cur = cur.next;
        }
        if (h1 != null)
            cur.next = h1;
        if (h2 != null)
            cur.next = h2;
        return dummyHead.next;
    }
}
