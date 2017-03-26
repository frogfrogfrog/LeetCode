package hard;

/**
 * Created by 42160 on 2017/3/21.
 */
public class Candy {
    public int candy(int[] ratings) {
        int nums = 0;
        int length = ratings.length;
        int[] candy = new int[length];
        for (int i = 1; i < length; i++) {
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;
        }
        nums += length;
        nums += candy[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i + 1] + 1, candy[i]);
            }
            nums += candy[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        new Candy().candy(new int[]{1, 2, 2});
    }
}
