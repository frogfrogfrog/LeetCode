package hard;

/**
 * Created by 42160 on 2017/3/4.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int count = m + n;
        int medianCount = count / 2;
        if (count % 2 != 0) {
            medianCount++;
        }
        int pos1 = 0, pos2 = 0;
        int least = 1;
        while (pos1 < m && pos2 < n) {

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(7 / 2);
    }
}
