package medium;

/**
 * Created by 42160 on 2016/12/25.
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    public int sumRootToLeaf(TreeNode node, int pathSum) {
        if (node == null)
            return 0;
        pathSum = pathSum * 10 + node.val;
        if (node.left == null && node.right == null)
            return pathSum;
        return sumRootToLeaf(node.left, pathSum) + sumRootToLeaf(node.right, pathSum);
    }
}
