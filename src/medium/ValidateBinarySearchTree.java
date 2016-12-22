package medium;

import java.util.Stack;

/**
 * Created by 42160 on 2016/12/22.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pos = root;
        TreeNode pre = null;
        while (pos != null || !stack.isEmpty()) {
            if (pos != null) {
                stack.push(pos);
                pos = pos.left;
            } else {
                pos = stack.pop();
                if (pre != null && pre.val >= pos.val)
                    return false;
                pre = pos;
                pos = pos.right;
            }
        }
        return true;
    }
}
