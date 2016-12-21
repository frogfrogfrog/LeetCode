package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/21.
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int length = s.length();
        if (length < 4)
            return res;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    for (int m = 1; m <= 3; m++) {
                        if (i + j + k + m == length) {
                            String s1 = s.substring(0, i);
                            String s2 = s.substring(i, i + j);
                            String s3 = s.substring(i + j, i + j + k);
                            String s4 = s.substring(i + j + k, length);
                            if (isIpValid(s1) && isIpValid(s2) && isIpValid(s3) && isIpValid(s4))
                                res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                        }
                    }

                }
            }
        }
        return res;
    }

    public boolean isIpValid(String s) {
        if (s.charAt(0) == '0' && s.length() > 1)
            return false;
        if (Integer.parseInt(s) <= 255)
            return true;
        return false;
    }
}
