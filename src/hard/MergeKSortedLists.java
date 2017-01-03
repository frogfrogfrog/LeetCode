package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by 42160 on 2017/1/3.
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val > o2.val)
                    return 1;
                else if (o1.val == o2.val)
                    return 0;
                else
                    return -1;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (ListNode node : lists) {
            if (node != null)
                queue.offer(node);
        }
        while (!queue.isEmpty()) {
            ListNode min = queue.poll();
            if (min.next != null)
                queue.offer(min.next);
            cur.next = min;
            cur = min;
        }
        return dummy.next;
    }
}
