package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/20.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        if (n == 0)
            return res;
        for (int i = 0; i < n; i++) {
            for (int j = (1 << i) - 1; j >= 0; j--) {
                res.add(res.get(j) ^ (1 << i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 4));
        int a = 4;
        System.out.println(a & a - 1);
    }
}
