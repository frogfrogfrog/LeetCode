package hard;

/**
 * Created by 42160 on 2016/12/19.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
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
