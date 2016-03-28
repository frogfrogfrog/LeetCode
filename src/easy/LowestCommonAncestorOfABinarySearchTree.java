package easy;

public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p.val>q.val)
			return lowestCommonAncestor(root, q, p);
		if(root.val>=p.val && root.val<=q.val)
			return root;
		return lowestCommonAncestor(root.val>p.val?root.left:root.right, p, q);
	}
}
