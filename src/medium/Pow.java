package medium;

/**
 * Created by 42160 on 2017/1/1.
 */
public class Pow {
    public double myPow(double x, int n) {
        double ans = 1;
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                ans = x;
                n = Integer.MAX_VALUE;
            } else {
                n = -n;
            }

        }
        while (n > 0) {
            if ((n & 1) == 1)
                ans *= x;
            x *= x;
            n >>= 1;
        }
        return ans;
    }
}
