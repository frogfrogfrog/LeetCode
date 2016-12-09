package easy;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q != null && p.val == q.val)
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) ? true : false;
        else
            return false;
    }
}
