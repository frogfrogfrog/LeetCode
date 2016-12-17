package medium;

/**
 * Created by 42160 on 2016/12/17.
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(5 / 2);
    }

}
