package easy;

/**
 * Created by 42160 on 2016/12/28.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 0; i < n - 1; i++) {
            int length = res.length();
            StringBuilder sb = new StringBuilder();
            for (int j = 0, count = 1; j < length; j++) {
                if (j + 1 < length && res.charAt(j) == res.charAt(j + 1))
                    count++;
                else {
                    sb.append(count).append(res.charAt(j));
                    count = 1;
                }
            }
            res = sb.toString();
        }
        return res;
    }

    public static void main(String[] args) {
        new CountAndSay().countAndSay(2);
    }
}
