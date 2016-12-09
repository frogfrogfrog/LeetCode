package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        do {
            int[] copy = nums.clone();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                temp.add(copy[i]);
            }
            res.add(temp);
        } while (nextPermutation(nums));
        return res;
    }

    public static boolean nextPermutation(int[] nums) {
        boolean res = false;
        int size = nums.length;
        int pos = size - 2;
        while (pos >= 0 && nums[pos] >= nums[pos + 1])
            pos--;
        if (pos >= 0) {
            res = true;
            int i = pos + 1;
            while (i < size && nums[i] > nums[pos])
                i++;
            int temp = nums[pos];
            nums[pos] = nums[i - 1];
            nums[i - 1] = temp;
        }

        int begin = pos + 1;
        int end = size - 1;
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
        return res;
    }
}
