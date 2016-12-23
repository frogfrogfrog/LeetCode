package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/23.
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        findPath(res, new LinkedList<>(), root, sum);
        return res;
    }

    public void findPath(List<List<Integer>> res, LinkedList<Integer> path, TreeNode node, int sum) {
        if (node == null)
            return;
        path.add(node.val);
        if (node.val == sum && node.left == null && node.right == null) {
            res.add(new LinkedList<>(path));
        } else {
            findPath(res, path, node.left, sum - node.val);
            findPath(res, path, node.right, sum - node.val);
        }
        path.removeLast();
    }
}
