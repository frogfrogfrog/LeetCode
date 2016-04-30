package medium;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int sum=0,i=0;
        for(;i<nums.length;i++){
        	sum+=i-nums[i];
        }
        return sum+i;
    }
}
