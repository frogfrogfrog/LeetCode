package medium;

/**
 * Created by 42160 on 2016/12/18.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int second = nums.length - 1, zero = 0;
        for (int i = 0; i <= second; i++) {
            while (nums[i] == 2 && i < second) {
                int tmp = nums[second];
                nums[second] = 2;
                nums[i] = tmp;
                second--;
            }
            while (nums[i] == 0 && i > zero) {
                int tmp = nums[zero];
                nums[zero] = 0;
                nums[i] = tmp;
                zero++;
            }
        }
    }

    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{1, 0});
    }
}

