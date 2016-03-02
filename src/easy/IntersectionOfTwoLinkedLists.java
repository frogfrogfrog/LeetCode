package easy;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode curA = headA, curB = headB;
		int sizeA = 0, sizeB = 0;
		while (curA != null) {
			sizeA++;
			curA=curA.next;
		}
		while (curB != null) {
			sizeB++;
			curB=curB.next;
		}
		ListNode tempA=headA,tempB=headB;
		if(sizeA<sizeB){
			int diff=sizeB-sizeA;
			while(diff!=0){
				tempB=tempB.next;
				diff--;
			}
		}else{
			int diff=sizeA-sizeB;
			while(diff!=0){
				tempA=tempA.next;
				diff--;
			}
		}
		while(tempA!=null){
			if(tempA==tempB)
				return tempA;
			tempA=tempA.next;
			tempB=tempB.next;
		}
		return null;
	}
}
