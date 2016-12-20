package medium;

/**
 * Created by 42160 on 2016/12/20.
 */
public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[left] < nums[mid]) {
                if (target < nums[left] || target > nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            } else if (nums[left] > nums[mid]) {
                if (target < nums[mid] || target > nums[right])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                left++;
            }
        }
        return false;
    }

    public boolean searchRecursive(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public boolean binarySearch(int[] nums, int left, int right, int target) {
        if (left > right)
            return false;
        if (nums[left] < nums[right] && (target < nums[left] || target > nums[right]))
            return false;
        int mid = (right - left) / 2 + left;
        if (nums[mid] == target)
            return true;
        if (nums[left] < nums[right]) {
            if (nums[mid] < target)
                return binarySearch(nums, mid + 1, right, target);
            else
                return binarySearch(nums, left, mid - 1, target);
        } else {
            return binarySearch(nums, left, mid - 1, target) || binarySearch(nums, mid + 1, right, target);
        }
    }
}
