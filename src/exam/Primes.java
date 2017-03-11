package exam;

import javax.xml.ws.soap.MTOM;
import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/7.
 */
public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
        int n = -2;
        int length = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[length];
        for (int i = 2; i < length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < length; i++) {
            if (!isPrime[i])
                continue;
            for (int j = i * i; j < length; j += i) {
                isPrime[j] = false;
            }
        }
        boolean flag = false;
        for (int i = 2; i < length; i++) {
            if (isPrime[i]) {
                int step = 1;
                for (int j = i * i; j <= n; j *= i) {
                    step++;
                    if (j == n) {
                        System.out.print(i + " " + step);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                break;
        }
        if (!flag)
            System.out.print("No");
    }

}
