package hard;

/**
 * Created by 42160 on 2017/1/2.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            if (rightMax < leftMax) {
                ans += rightMax - height[right];
                right--;
            } else {
                ans += leftMax - height[left];
                left++;
            }
        }
        return ans;
    }
}
