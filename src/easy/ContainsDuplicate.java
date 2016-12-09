package easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
