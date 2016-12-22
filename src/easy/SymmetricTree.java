package easy;

import java.util.ArrayList;

/**
 * Created by 42160 on 2016/12/22.
 */
public class SymmetricTree {
    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null ^ right == null)
            return false;
        if (left.val != right.val)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        ArrayList<TreeNode> tree = new ArrayList<>();
        tree.add(root.left);
        tree.add(root.right);
        int left = 0, right = 1, last = 1;
        while (left <= right) {
            for (int i = left; i < right; i += 2) {
                TreeNode cur = tree.get(i);
                TreeNode sym = tree.get(i + 1);
                if (cur != null && sym != null && cur.val == sym.val) {
                    tree.add(cur.left);
                    tree.add(sym.right);
                    tree.add(cur.right);
                    tree.add(sym.left);
                    last += 4;
                } else if (cur == null && sym == null) {

                } else
                    return false;
            }
            left = right + 1;
            right = last;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = null;
        TreeNode l4 = new TreeNode(3);
        TreeNode l5 = null;
        TreeNode l6 = new TreeNode(3);
        root.left = l1;
        root.right = l2;
        l1.left = l3;
        l1.right = l4;
        l2.left = l5;
        l2.right = l6;
        new SymmetricTree().isSymmetric(root);
    }
}
