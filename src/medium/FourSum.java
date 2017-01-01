package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 42160 on 2017/1/1.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int size = nums.length;
        if (size < 4)
            return res;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[size - 1];
        for (int i = 0; i < size - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < size - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int left = j + 1;
                        int right = size - 1;
                        while (left < right) {
                            int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                            if (tmp == target) {
                                res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                                while (left < right && nums[left] == nums[left + 1])
                                    left++;
                                while (left < right && nums[right] == nums[right - 1])
                                    right--;
                                left++;
                                right--;
                            } else if (tmp < target) {
                                left++;
                            } else {
                                right--;
                            }
                        }
                    }
                }

            }
        }
        return res;
    }
}
