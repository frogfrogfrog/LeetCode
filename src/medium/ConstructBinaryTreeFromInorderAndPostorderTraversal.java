package medium;

/**
 * Created by 42160 on 2016/12/22.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0)
            return null;
        int end = inorder.length - 1;
        return buildTree(end, 0, end, inorder, postorder);

    }

    public TreeNode buildTree(int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder) {
        if (inStart == inEnd)
            return new TreeNode(postorder[postEnd]);
        if (inStart > inEnd)
            return null;
        TreeNode node = new TreeNode(postorder[postEnd]);
        for (int i = inStart; i <= inEnd; i++) {
            if (postorder[postEnd] == inorder[i]) {
                node.right = buildTree(postEnd - 1, i + 1, inEnd, inorder, postorder);
                int rightSize = inEnd - i;
                node.left = buildTree(postEnd - 1 - rightSize, inStart, i - 1, inorder, postorder);
                break;
            }
        }
        return node;
    }
}
