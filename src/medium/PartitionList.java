package medium;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode bigHead = new ListNode(0);
        ListNode cur = head, small = smallHead, big = bigHead;
        while (cur != null) {
            ListNode next = cur.next;
            if (cur.val < x) {
                small.next = cur;
                small = cur;
                small.next = null;
            } else {
                big.next = cur;
                big = cur;
                big.next = null;
            }
            cur = next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }
}
