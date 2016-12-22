package medium;

/**
 * Created by 42160 on 2016/12/22.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0)
            return null;
        int end = inorder.length - 1;
        return buildTree(0, 0, end, preorder, inorder);
    }

    public TreeNode buildTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (inStart == inEnd)
            return new TreeNode(preorder[preStart]);
        if (inStart > inEnd)
            return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (preorder[preStart] == inorder[i]) {
                node.left = buildTree(preStart + 1, inStart, i - 1, preorder, inorder);
                int leftSize = i - inStart;
                node.right = buildTree(preStart + leftSize + 1, i + 1, inEnd, preorder, inorder);
                break;
            }
        }
        return node;
    }
}
