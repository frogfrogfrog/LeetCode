package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res.clear();
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
                sum += candidates[i];
                ans.add(candidates[i]);
                findASolution(candidates, ans, target, sum, i);
                sum -= candidates[i];
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        cs.combinationSum(new int[]{2, 2, 2, 3, 6, 7}, 7);
        for (int i = 0; i < cs.res.size(); i++) {

            System.out.println(cs.res.get(i));
        }
    }
}
