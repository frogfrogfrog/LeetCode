package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/25.
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        helper(res, new ArrayList<String>(), s, 0, s.length());
        return res;
    }

    public void helper(List<List<String>> res, List<String> ans, String s, int index, int length) {
        if (index == length)
            res.add(new ArrayList<>(ans));
        for (int i = index; i < length; i++) {
            int left = index, right = i;
            boolean canPartition = true;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    canPartition = false;
                    break;
                }
                left++;
                right--;
            }
            if (canPartition) {
                ans.add(s.substring(index, i + 1));
                helper(res, ans, s, i + 1, length);
                ans.remove(ans.size() - 1);
            } else
                continue;
        }
    }
}
