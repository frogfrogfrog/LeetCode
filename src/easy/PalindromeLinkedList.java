package easy;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        boolean res = true;
        if (head == null || head.next == null)
            return true;
        ListNode fast = head, slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null)
                fast = fast.next;
            else
                break;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        slow.next = null;

        ListNode curList1 = head;
        ListNode curList2 = prev;
        while (curList2 != null) {
            if (curList2.val != curList1.val) {
                res = false;
                break;
            } else {
                curList1 = curList1.next;
                curList2 = curList2.next;
            }
        }
        return res;
    }

}
