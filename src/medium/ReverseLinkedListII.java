package medium;

public class ReverseLinkedListII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, cur = head;
        ListNode tempPrev, tempCur;
        for (int i = 0; i < m - 1; i++) {
            prev = cur;
            cur = cur.next;
        }
        tempPrev = prev;
        tempCur = cur;
        for (int i = 0; i < n - m + 1; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        tempPrev.next = prev;
        tempCur.next = cur;
        return dummy.next;
    }
}
