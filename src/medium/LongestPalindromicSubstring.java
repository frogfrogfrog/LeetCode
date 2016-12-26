package medium;

/**
 * Created by 42160 on 2016/12/26.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = 2 * s.length() + 1;
        char[] chars = new char[length];
        int id = 0, mx = 0, longest = 0;
        int[] p = new int[length];
        for (int i = 0, k = 0; i < length - 1; k++) {
            chars[i++] = '#';
            chars[i++] = s.charAt(k);
        }
        chars[length - 1] = '#';
        for (int i = 0; i < length; i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (i + p[i] < length && i - p[i] >= 0 && chars[i + p[i]] == chars[i - p[i]])
                p[i]++;
            if (i + p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
            if (p[i] > p[longest])
                longest = i;
        }
        String res = "";
        for (int i = longest - p[longest] + 1; i < longest + p[longest]; i++) {
            if (chars[i] != '#')
                res += chars[i];
        }
        return res;
    }
}
