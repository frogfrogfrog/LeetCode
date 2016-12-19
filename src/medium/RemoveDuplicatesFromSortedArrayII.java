package medium;

/**
 * Created by 42160 on 2016/12/19.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int ans = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i < 2 || nums[i] != nums[ans - 2]) {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"1", "1", "1", "2", "2", "3"};
        print(a);
        a[0] = a[3];
        a[3] = a[5];
        print(a);
        a[5] = "5";
        print(a);
        String b = new String("1");
        System.out.println(a[1] == b);
    }

    public static void print(String[] a) {
        for (String i : a) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
