package medium;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode fast=head,slow=head;
		while(true){
			if(fast!=null)
				fast=fast.next;
			else
				return false;
			if(fast!=null)
				fast=fast.next;
			else
				return false;
			if(slow!=null)
				slow=slow.next;
			else
				return false;
			if(slow==fast)
				return true;
		}
	}
}
