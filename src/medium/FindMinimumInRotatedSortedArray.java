package medium;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
        int length=nums.length;
        if(length==0)
        	return 0;
        int min=nums[0];
        for(int i=1;i<length;i++){
        	if(nums[i]<min)
        		min=nums[i];
        }
        return min;
    }
}
