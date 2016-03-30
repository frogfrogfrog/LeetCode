package medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	public int singleNumber(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			if (map.get(nums[i])==null){
				map.put(nums[i], false);
			}else if(map.get(nums[i])==false){
				map.put(nums[i], true);
			}else{
				map.remove(nums[i]);
			}
		}
		return (int) map.keySet().toArray()[0];
	}

}
