package medium;

public class RemoveDuplicatesFromSortedListII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedListII().test();
    }

    public void test() {
        ListNode l1 = new ListNode(1);
//		ListNode l2=new ListNode(2);
//		ListNode l3=new ListNode(2);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=null;
        ListNode l4 = new RemoveDuplicatesFromSortedListII().deleteDuplicates(l1);
        System.out.println(l4.val);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode stub = new ListNode(0);
        stub.next = head;
        ListNode prev = stub;
        ListNode cur = head;
        ListNode temp = head.next;
        boolean flag = false;
        while (cur != null) {
            if (temp == null) {
                if (flag == true) {
                    prev.next = null;
                }
                break;
            } else if (cur.val == temp.val) {
                flag = true;
                cur.next = temp.next;
                temp = temp.next;
            } else if (flag == true) {
                cur = temp;
                temp = temp.next;
                prev.next = cur;
                flag = false;
            } else {
                prev = cur;
                cur = temp;
                temp = temp.next;
            }
        }
        return stub.next;
    }
}
