package easy;


public class RemoveDuplicatesFromSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return head;
		ListNode cur=head;
		ListNode temp=cur.next;
		while(cur.next!=null){
			if(temp.val==cur.val){
				cur.next=temp.next;
				temp=temp.next;
			}else{
				cur=temp;
				temp=temp.next;
			}
		}
		return head;
	}
}
