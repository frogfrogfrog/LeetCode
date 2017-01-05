package hard;

/**
 * Created by 42160 on 2017/1/5.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode begin = dummy;
        while (true) {
            ListNode ret = reverse(begin, k - 1);
            if (ret == null) {
                reverse(begin, k - 1);
                break;
            }
            begin = ret;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode begin, int count) {
        ListNode cur = begin.next, tmp;
        while (count > 0) {
            if (cur == null || cur.next == null)
                return null;
            tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = begin.next;
            begin.next = tmp;
            count--;
        }
        return cur;
    }
}
