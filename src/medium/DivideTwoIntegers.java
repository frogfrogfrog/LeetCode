package medium;

/**
 * Created by 42160 on 2016/12/28.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (dividend == 0 || divisor == Integer.MIN_VALUE)
            return 0;
        if (dividend > 0 && divisor > 0 && dividend < divisor)
            return 0;
        if (dividend < 0 && divisor < 0 && dividend > divisor)
            return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;
        int res = 0;
        int flag = 1;
        if ((dividend ^ divisor) < 0)
            flag = -1;
        divisor = Math.abs(divisor);
        if (dividend == Integer.MIN_VALUE) {
            res += 1;
            dividend += divisor;
        }
        dividend = Math.abs(dividend);
        int i = 1, sub = divisor;
        while (dividend >= divisor) {
            if (dividend >= sub) {
                res += i;
                dividend -= sub;
                sub <<= 1;
                i <<= 1;
            } else {
                i = 1;
                sub = divisor;
            }
        }
        return res * flag;
    }

    public static void main(String[] args) {
        new DivideTwoIntegers().divide(0, 1);
    }
}
