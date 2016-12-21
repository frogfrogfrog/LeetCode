package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 42160 on 2016/12/20.
 * 思路就是如果nums[i]==nums[i-1]的话，就只把nums[i]添加到nums[i-1]产生的结果集中，而不是添加所有之前产生的结果集中。
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        Arrays.sort(nums);
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            int end = res.size();
            if (i == 0 || nums[i] != nums[i - 1]) {
                start = 0;
            }
            for (int j = start; j < end; j++) {
                tmp = new ArrayList<Integer>(res.get(j));
                tmp.add(nums[i]);
                res.add(new ArrayList<Integer>(tmp));
            }
            start = end;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
