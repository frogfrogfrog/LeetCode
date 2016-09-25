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
}
