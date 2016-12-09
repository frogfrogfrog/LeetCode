package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> res = new ThreeSum().threeSum(new int[]{0, -4, -1, -4, -2, -3, 2});
        for (int i = 0; i < res.size(); i++) {
            List<Integer> temp = res.get(i);
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j) + ",");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                break;
            } else if ((i > 0 && nums[i] == nums[i - 1])) {
                continue;
            } else {
                //�б�
                int target = -nums[i];
                int left = i + 1;
                int right = size - 1;
                while (left < right) {
                    int add = nums[left] + nums[right];
                    if (add == target) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < size - 1 && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        while (right > i + 1 && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (add < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
