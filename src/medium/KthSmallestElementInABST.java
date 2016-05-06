package medium;

import java.util.Stack;

public class KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
		int res=0;
		int count=0;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode pos=root;
		while(pos!=null || !stack.isEmpty()){
			if(pos!=null){
				stack.push(pos);
				pos=pos.left;
			}else{
				pos=stack.pop();
				count++;
				if(count==k)
					return pos.val;
				pos=pos.right;
			}
		}
        return res;
    }
}
