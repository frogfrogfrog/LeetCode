package medium;

public class ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		return toBST(head, null);
	}

	public TreeNode toBST(ListNode head, ListNode tail) {
		if (head == tail)
			return null;
		ListNode slow = head, fast = head;
		while (fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode node = new TreeNode(slow.val);
		node.left = toBST(head, slow);
		node.right = toBST(slow.next, tail);
		return node;
	}
}
