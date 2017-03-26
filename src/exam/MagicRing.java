package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/25.
 */
public class MagicRing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        magicKTimes(nums, k);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print(nums[n - 1]);
    }

    public static void magicKTimes(int[] nums, int k) {
        int size = nums.length;
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = nums[i];
        }
        for (int i = 0; i < size; i++) {
            int count = 0;
            while (count < k) {
                nums[i] = nums[i] + copy[(count + i + 1) % (size)] * (k - count);
                nums[i] %= 100;
                count++;
            }
        }
    }

//    public static void magicKTimes(int[] nums,int k){
//        while (k>0){
//            int size=nums.length;
//            int tmp=nums[0];
//            int i=0;
//            for (;i<size-1;i++){
//                nums[i]+=nums[i+1];
//                if(nums[i]>=100)
//                    nums[i]%=100;
//            }
//            nums[size-1]+=tmp;
//            if(nums[0]>=100)
//                nums[0]%=100;
//            k--;
//        }
//    }
}
