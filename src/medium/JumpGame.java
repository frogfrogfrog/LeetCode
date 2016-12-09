package medium;

/**
 * Created by 42160 on 2016/12/6.
 */
public class JumpGame {
    public static void main(String[] args) {
        System.out.println("ddd");
    }

    public boolean canJump(int[] nums) {
        if (nums.length <= 1)
            return true;
        int needJump = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= needJump) {
                needJump = 1;
            } else {
                needJump++;
            }
        }
        return needJump == 1 ? true : false;
    }
}


