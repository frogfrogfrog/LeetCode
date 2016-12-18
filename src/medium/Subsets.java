package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/18.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        res.add(tmp);
        for (int i = 0; i < nums.length; i++) {
            int n = res.size();
            for (int j = 0; j < n; j++) {
                tmp = new ArrayList<Integer>(res.get(j));
                tmp.add(nums[i]);
                res.add(new ArrayList<Integer>(tmp));
            }
        }
        return res;
    }
}
