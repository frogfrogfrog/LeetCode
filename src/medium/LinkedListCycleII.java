package medium;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head, slow = head;
		while (true) {
			if (fast != null)
				fast = fast.next;
			else
				return null;
			if (fast != null)
				fast = fast.next;
			else
				return null;
			if (slow != null)
				slow = slow.next;
			else
				return null;
			if (slow == fast){
				//ͷ����Ϊx,�����ĵ����Ϊy��һ�θ���һ�����������������
				slow=head;
				while(slow!=fast){
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
				
		}
	}
}
