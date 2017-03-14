package medium;

/**
 * Created by 42160 on 2017/3/14.
 */
public class WiggleSubsequence {
    public static void main(String[] args) {
        new WiggleSubsequence().wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5});
    }

    public int wiggleMaxLength(int[] nums) {
        int ans = 1;
        int length = nums.length;
        if (length < 2)
            return length;
        for (int i = 1; i < length; ) {
            if (nums[i] > nums[i - 1]) {
                ans++;
                while (i < length && nums[i] >= nums[i - 1])
                    i++;
            } else if (nums[i] < nums[i - 1]) {
                ans++;
                while (i < length && nums[i] <= nums[i - 1])
                    i++;
            } else
                i++;
        }
        return ans;
    }
}
