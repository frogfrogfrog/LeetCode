package easy;

/**
 * Created by 42160 on 2016/12/28.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        while (haystack.length() - i >= needle.length()) {
            while (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length())
                return i - needle.length();
            else
                j = 0;
        }
        return -1;
    }
}
