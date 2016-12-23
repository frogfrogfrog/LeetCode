package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/23.
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int findPath(TreeNode node, int sum) {
        int res = 0;
        if (node == null)
            return res;
        sum -= node.val;
        if (sum == 0)
            res++;
        res += findPath(node.left, sum);
        res += findPath(node.right, sum);
        return res;
    }
}
