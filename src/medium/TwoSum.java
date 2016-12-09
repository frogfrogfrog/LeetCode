package medium;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < size; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                result[0] = i;
                result[1] = index;
                break;
            }
        }
        return result;
    }
}
