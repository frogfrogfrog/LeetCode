package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size < 2) {
            return size;
        }
        int res = 1;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != nums[i + 1])
                nums[res++] = nums[i + 1];
        }
        return res;
    }
}
