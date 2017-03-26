package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/7.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String input=in.nextLine();
        String input = "15 3";
        String[] strs = input.split(" ");
        int N = Integer.parseInt(strs[0]);
        int L = Integer.parseInt(strs[1]);
        boolean flag = false;
        for (int i = L; i <= 100; i++) {
            if (i % 2 == 1) {
                if (N % i == 0) {
                    int least = N / i - i / 2;
                    int j = least;
                    for (int k = 0; k < i - 1; k++, j++) {
                        System.out.print(j + " ");
                    }
                    System.out.print(j);
                    return;
                }
            } else {
                int rem = i / 2;
                if (N % i == rem) {
                    int least = N / i - i / 2 + 1;
                    int j = least;
                    for (int k = 0; k < i - 1; k++, j++) {
                        System.out.print(j + " ");
                    }
                    System.out.print(j);
                    return;
                }
            }
        }
        System.out.print("No");
    }


    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] strs = input.split(" ");
        int A = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);
        int K = Integer.parseInt(strs[2]);

    }

}