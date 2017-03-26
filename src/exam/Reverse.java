package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/24.
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] nums = str.split(",");
        int a = reverseFromStr(nums[0]);
        int b = reverseFromStr(nums[1]);
        if (a < 1 || a > 70000 || b < 1 || b > 70000) {
            System.out.print(-1);
        } else
            System.out.print(a + b);
    }

    public static int reverseFromStr(String str) {
        int res = 0;
        int len = str.length();
        int i = len - 1;
        while (i >= 0 && str.charAt(i) == '0')
            i--;
        while (i >= 0) {
            res = res * 10;
            res = res + (str.charAt(i) - '0');
            i--;
        }

        return res;
    }
}
