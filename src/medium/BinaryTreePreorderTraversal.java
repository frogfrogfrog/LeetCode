package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		List<Integer> res=new LinkedList<Integer>();
		TreeNode pos=root;
		while(pos!=null || !stack.isEmpty()){
			if(pos!=null){
				res.add(pos.val);
				stack.push(pos);
				pos=pos.left;
			}else{
				pos=stack.pop();
				pos=pos.right;
			}
		}
		return res;
    }
}
