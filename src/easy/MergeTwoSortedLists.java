package easy;

public class MergeTwoSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		ListNode start;
		ListNode cur;
		if(l2.val<l1.val){
			start=cur=l2;
			l2=l2.next;
		}
		else{
			start=cur=l1;
			l1=l1.next;
		}
		while(l1!=null && l2!=null){
			if(l2.val<l1.val){
				cur.next=l2;
				cur=cur.next;
				l2=l2.next;
			}else{
				cur.next=l1;
				cur=cur.next;
				l1=l1.next;
			}
		}
		if(l1!=null)
			cur.next=l1;
		if(l2!=null)
			cur.next=l2;
		return start;
	}
}
