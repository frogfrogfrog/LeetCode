package easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int size=nums.length;
		int res=0;
		for(int i=0;i<size;i++){
			if(nums[i]!=val)
				nums[res++]=nums[i];
		}
		return res;
	}
}
