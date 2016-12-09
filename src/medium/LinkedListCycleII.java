package medium;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast != null)
                fast = fast.next;
            else
                return null;
            if (fast != null)
                fast = fast.next;
            else
                return null;
            if (slow != null)
                slow = slow.next;
            else
                return null;
            if (slow == fast) {
                //头假设为x,相遇的点假设为y，一次各迈一步，最终相遇在起点
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }
    }
}
