package hard;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		List<Integer> res=new LinkedList<Integer>();
		if(root==null)
			return res;
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode cur=stack.pop();
			res.add(0, cur.val);
			if(cur.left!=null)
				stack.push(cur.left);
			if(cur.right!=null)
				stack.push(cur.right);
		}
		return res;
    }
}
