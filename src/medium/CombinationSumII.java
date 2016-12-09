package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res.clear();
        Arrays.sort(candidates);
        this.findASolution(candidates, new ArrayList<Integer>(), target, 0, 0);
        return res;
    }

    private void findASolution(int[] candidates, ArrayList<Integer> ans, int target, int sum, int start) {
        if (sum > target)
            return;
        else if (sum == target)
            res.add((List<Integer>) ans.clone());
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1])
                    continue;
                sum += candidates[i];
                ans.add(candidates[i]);
                findASolution(candidates, ans, target, sum, i + 1);
                sum -= candidates[i];
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSumII cs = new CombinationSumII();
        cs.combinationSum2(new int[]{1, 10, 1, 2, 7, 6, 1, 5}, 8);
        for (int i = 0; i < cs.res.size(); i++) {

            System.out.println(cs.res.get(i));
        }
    }
}
