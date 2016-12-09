package easy;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        rotate(nums, 0, size - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, size - 1);
    }

    public void rotate(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
