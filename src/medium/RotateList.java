package medium;

public class RotateList {
	public static void main(String[] args){
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		l1.next=l2;
		l2.next=null;
		new RotateList().rotateRight(l1, 1);
	}
	public ListNode rotateRight(ListNode head, int k) {
		if(head==null)
			return head;
		int count =0;
		ListNode cur=head;
		while(cur!=null){
			count++;
			cur=cur.next;
		}
		k=k%count;
		if(k==0)
			return head;
		cur=head;
		k=count-k;
		while(k>1){
			k--;
			cur=cur.next;
		}
		ListNode newHead=cur.next;
		cur.next=null;
		cur=newHead;
		while(cur.next!=null)
			cur=cur.next;
		cur.next=head;
		return newHead;
	}
}
