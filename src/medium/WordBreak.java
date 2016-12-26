package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 42160 on 2016/12/25.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (wordDict.contains(s.substring(0, i + 1))) {
                dp[i] = true;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j + 1, i + 1))) {
                    dp[i] = true;
                    break;
                }
            }

        }
        return dp[length - 1];
    }

    public static void main(String[] args) {
        new WordBreak().wordBreak("leetcode", new HashSet<>(Arrays.asList("leet", "code")));
    }
}
