package easy;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode prev = null;
        while (cur.next != null) {
            cur.val = cur.next.val;
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
    }
}
