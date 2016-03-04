package medium;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head==null)
			return null;
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode newCur=dummy,cur=head.next;
		head.next=null;
		while(cur!=null){
			while(newCur.next!=null && newCur.next.val<cur.val){
				newCur=newCur.next;
			}
			ListNode temp=cur.next;
			cur.next=newCur.next;
			newCur.next=cur;
			cur=temp;
			newCur=dummy;
		}
		return dummy.next;
	}
}
