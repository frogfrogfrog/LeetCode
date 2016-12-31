package medium;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 42160 on 2016/12/31.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        if (size < 3)
            return 0;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[size - 1];
        for (int i = 0; i < size - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = size - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[left] + nums[right];
                    if (tmp == target)
                        return tmp;
                    if (Math.abs(tmp - target) < Math.abs(closest - target))
                        closest = tmp;
                    if (tmp < target)
                        left++;
                    else
                        right--;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        new ThreeSumClosest().threeSumClosest(new int[]{-1, 0, 1, 1, 55}, 3);
    }
}
