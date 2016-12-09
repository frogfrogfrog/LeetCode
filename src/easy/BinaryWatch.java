package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    ArrayList<String> res = new ArrayList<String>();

    public List<String> readBinaryWatch(int num) {
        res.clear();
        dfs(new int[10], 0, num);
        return res;
    }

    private void dfs(int[] a, int index, int count) {
        if (count == 0) {
            String s = this.getTime(a);
            if (s != null) {
                res.add(s);
                return;
            }
        }
        if (index >= a.length)
            return;
        a[index] = 1;
        dfs(a, index + 1, count - 1);
        a[index] = 0;
        dfs(a, index + 1, count);
    }

    private String getTime(int[] a) {
        int hour = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i] == 1) {
                hour += Math.pow(2, 4 - i - 1);
            }
        }
        int min = 0;
        for (int i = 4; i < 10; i++) {
            if (a[i] == 1) {
                min += Math.pow(2, 10 - i - 1);
            }
        }

        if (hour <= 11 && min <= 59) {
            String shour = String.valueOf(hour);
            String smin = String.valueOf(min);
            if (min < 10)
                smin = "0" + smin;
            return shour + ":" + smin;
        }
        return null;
    }

}
