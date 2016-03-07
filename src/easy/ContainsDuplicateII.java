package easy;

import java.util.HashSet;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			if (!set.add(nums[i])){
				for(int j=1;j<=k;j++){
					if((i+j<size && nums[i]==nums[i+j]) || (i-j>=0 && nums[i]==nums[i-j]) )
						return true;
				}
			}
		}
		return false;
	}
}
