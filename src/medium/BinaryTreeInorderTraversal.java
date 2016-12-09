package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new LinkedList<Integer>();
        TreeNode pos = root;
        while (pos != null || !stack.isEmpty()) {
            if (pos != null) {
                stack.push(pos);
                pos = pos.left;
            } else {
                pos = stack.pop();
                res.add(pos.val);
                pos = pos.right;
            }
        }
        return res;
    }
}
