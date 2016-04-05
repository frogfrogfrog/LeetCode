package easy;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return getHeight(root)!=-1;
    }
	public int getHeight(TreeNode node){
		if(node==null)
			return 0;
		int left=getHeight(node.left);
		if(left==-1)
			return -1; 
		int right=getHeight(node.right);
		if(right==-1)
			return -1;
		if(left-right<-1 || left-right>1)
			return -1;
		return Math.max(left, right)+1;
	}
}
