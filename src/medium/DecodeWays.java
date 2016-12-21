package medium;

/**
 * Created by 42160 on 2016/12/21.
 */
public class DecodeWays {
    public int numDecodings(String s) {
        int length = s.length();
        if (length == 0 || s.charAt(0) == '0')
            return 0;
        int[] dp = new int[length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < length; i++) {
            int cur = s.charAt(i) - '0';
            int prev = s.charAt(i - 1) - '0';
            int twoDigit = prev * 10 + cur;
            if (cur == 0 && (prev == 0 || prev > 2))
                return 0;
            if (twoDigit == 10 || twoDigit == 20)
                dp[i + 1] = dp[i - 1];
            else if (prev != 0 && twoDigit <= 26)
                dp[i + 1] = dp[i] + dp[i - 1];
            else
                dp[i + 1] = dp[i];
        }
        return dp[length];
    }

    public static void main(String[] args) {
        new DecodeWays().numDecodings("11");
    }
}
