package easy;

public class IntegerBreak {
    public int integerBreak(int n) {
        int res = 1;
        if (n <= 3)
            return n - 1;
        while (n > 0) {
            if (n > 4 || n == 3) {
                n -= 3;
                res *= 3;
            } else {
                n -= 2;
                res *= 2;
            }
        }
        return res;
    }
}
