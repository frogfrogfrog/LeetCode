package medium;

/**
 * 
 * @author yzx12
 *先把list后半部分反转，然后合并两个表
 */
public class ReorderList {
	public void reorderList(ListNode head) {
		if(head==null || head.next==null || head.next.next==null)
			return;
		ListNode fast=head,slow=head;
		while(fast.next!=null){
			fast=fast.next;
			if(fast.next!=null)
				fast=fast.next;
			else
				break;
			slow=slow.next;
		}
		ListNode prev=null;
		ListNode cur=slow.next;
		while(cur!=null){
			ListNode next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		slow.next=null;
		
		//merge
		ListNode head1=head;
		ListNode head2=prev;
		while(head2!=null){
			ListNode next=head1.next;
			head1.next=head2;
			head2=head2.next;
			head1.next.next=next;
			head1=next;
		}
	}
}
