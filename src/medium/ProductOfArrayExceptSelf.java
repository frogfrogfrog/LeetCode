package medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        res[0] = 1;
        for (int i = 1; i < size; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int j = size - 1; j >= 0; j--) {
            res[j] *= right;
            right *= nums[j];
        }
        return res;
    }
}
