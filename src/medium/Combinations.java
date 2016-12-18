package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/18.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combine(1, n, k, new ArrayList<Integer>(), res);
        return res;
    }

    public void combine(int start, int n, int need, List<Integer> ans, List<List<Integer>> res) {
        if (need == 0) {
            res.add(new ArrayList<Integer>(ans));
        } else if (n - start + 1 >= need) {
            ans.add(start);
            combine(start + 1, n, need - 1, ans, res);
            ans.remove(ans.size() - 1);
            combine(start + 1, n, need, ans, res);
        }
    }
}
