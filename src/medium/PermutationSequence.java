package medium;

import java.util.ArrayList;

/**
 * Created by 42160 on 2016/12/10.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {

        int[] factorial = new int[n];
        factorial[0] = 1;

        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        String res = "";
        for (int i = n - 1; i >= 0; i--) {

            int num = (k - 1) / factorial[i];
            res += numbers.get(num);
            k -= num * factorial[i];
            numbers.remove(num);
        }

        return res;
    }
}
