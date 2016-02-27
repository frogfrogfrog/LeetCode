package easy;

public class ReverseLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		if(head==null || head.next==null)
			return head;
		ListNode left=null;
		ListNode mid=head;
		ListNode right=head.next;
		while(mid!=null){
			mid.next=left;
			left=mid;
			mid=right;
			if(right!=null)
				right=right.next;
		}
		return left;
	}
}
