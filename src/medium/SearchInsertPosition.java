package medium;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int index=0;
		int length=nums.length;
		while(index<length && target>nums[index] ){
			index++;
		}
        return index;
    }
}
