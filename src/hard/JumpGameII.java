package hard;

/**
 * Created by 42160 on 2017/1/2.
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int size = nums.length, start = 0, end = 0, maxend = 0, step = 0;
        while (end < size - 1) {
            step++;
            for (int i = start; i < end; i++) {
                if (nums[i] + i >= size - 1) return step;
                maxend = Math.max(maxend, nums[i] + i);
            }
            start = end + 1;
            end = maxend;
        }
        return step;
    }
}
