package easy;

public class RemoveNthNodeFromEndOfList {
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length=0;
		ListNode cur=head;
		while(cur!=null){
			length++;
			cur=cur.next;
		}
		int pos=length-n;
		cur=head;
		if(pos==0){
			return head.next;
		}
		while(pos!=1){
			pos--;
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return head;
	}
}
