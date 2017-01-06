package medium;

/**
 * Created by 42160 on 2017/1/6.
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        int left = 0, right = length - 1;
        while (true) {
            int index = findKthLargest(nums, left, right);
            if (length - index == k) {
                return nums[index];
            } else if (length - index < k) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }
    }

    public int findKthLargest(int[] nums, int start, int end) {
        int pivot = start, temp;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;
            if (start > end) break;
            swap(nums, start, end);
        }
        swap(nums, pivot, end);
        return end;
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
