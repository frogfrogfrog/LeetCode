package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/25.
 */
public class BoyGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int size = str.length();
        int countB = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == 'B') {
                countB++;
            }
        }
        if (countB == 0)
            System.out.print(0);
        int step = 0;
        int count = countB;
        for (int i = 0; i < size; i++) {
            int target = size - 1 - count + 1;
            if (str.charAt(i) == 'B') {
                step = (target - i) + step;
                count--;
            }
        }

        int step1 = 0;
        int count1 = countB;
        for (int i = size - 1; i >= 0; i--) {
            int target = count1;
            if (str.charAt(i) == 'B') {
                step1 = (i - target) + step1;
                count1--;
            }
        }
        if (step1 < step)
            System.out.print(step1);
        else
            System.out.print(step);
    }
}
