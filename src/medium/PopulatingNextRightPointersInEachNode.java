package medium;

public class PopulatingNextRightPointersInEachNode {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	public void connect(TreeLinkNode root) {
		if(root==null || root.left==null)
			return;
		connect(root.left,root.right);
	}

	public void connect(TreeLinkNode left, TreeLinkNode right) {
		left.next = right;
		if (left.left != null) {
			connect(left.left, left.right);
			connect(left.right, right.left);
			connect(right.left, right.right);
		}
	}
}
