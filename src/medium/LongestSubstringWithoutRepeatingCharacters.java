package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 42160 on 2016/12/26.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        int slow = 0, fast = 0, max = 0;
        while (fast < length) {
            if (set.contains(s.charAt(fast)))
                set.remove(s.charAt(slow++));
            else {
                set.add(s.charAt(fast++));
                max = set.size() > max ? set.size() : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "beacadghi";
        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
    }
}
