package medium;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length-1);
    }
	public TreeNode toBST(int[] nums,int start,int end){
		if(start>end)
			return null;
		int index=(start+end+1)/2;
		TreeNode root=new TreeNode(nums[index]);
		root.left=toBST(nums, start, index-1);
		root.right=toBST(nums, index+1, end);
		return root;
	}
}
