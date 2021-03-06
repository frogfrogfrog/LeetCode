package hard;

/**
 * Created by 42160 on 2016/12/19.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (target < nums[left] || target > nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            } else {
                if (target < nums[mid] || target > nums[right])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return index;
    }

    public int searchRecursive(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right)
            return -1;
        if (nums[left] < nums[right] && (target < nums[left] || target > nums[right]))
            return -1;
        int mid = (right - left) / 2 + left;
        if (nums[mid] == target)
            return mid;
        if (nums[left] < nums[right]) {
            if (nums[mid] < target)
                return binarySearch(nums, mid + 1, right, target);
            else
                return binarySearch(nums, left, mid - 1, target);
        } else {
            int ans1 = binarySearch(nums, left, mid - 1, target);
            int ans2 = binarySearch(nums, mid + 1, right, target);
            int res = ans2 >= ans1 ? ans2 : ans1;
            return res;
        }
    }
}
