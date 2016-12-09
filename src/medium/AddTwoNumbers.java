package medium;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode cur = new ListNode(0);
        ListNode head = cur;
        while (l1 != null || l2 != null) {
            int temp = 0;
            if (l1 != null)
                temp += l1.val;
            if (l2 != null)
                temp += l2.val;
            temp += carry;
            ListNode newNode = new ListNode(temp);
            carry = 0;
            if (newNode.val >= 10) {
                newNode.val = newNode.val - 10;
                carry = 1;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            cur.next = newNode;
            cur = newNode;
        }
        if (carry != 0) {
            ListNode newNode = new ListNode(1);
            cur.next = newNode;
        }
        return head.next;
    }
}
