package medium;

/**
 * Created by 42160 on 2016/12/8.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int tmpMax = 0;
        for (int i = 1; i < nums.length; i++) {
            tmpMax += nums[i];
            if (tmpMax > max)
                max = tmpMax;
            if (tmpMax < 0)
                tmpMax = 0;
        }
        return max;
    }
}
