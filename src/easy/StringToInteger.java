package easy;


/**
 * Created by 42160 on 2016/12/27.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        int res = 0;
        int flag = 1;
        int max = Integer.MAX_VALUE / 10, maxRem = Integer.MAX_VALUE % 10;
        int min = -(Integer.MIN_VALUE / 10), minRem = -(Integer.MIN_VALUE % 10);
        int index = 0, length = str.length();
        while (index < length && str.charAt(index) == ' ') {
            index++;
        }
        if (index != length) {
            if (str.charAt(index) == '+') {
                index++;
            } else if (str.charAt(index) == '-') {
                index++;
                flag = -1;
            }
            while (index < length) {
                if (!Character.isDigit(str.charAt(index)))
                    break;
                int cur = str.charAt(index) - '0';
                if (flag == 1 && (res > max || (res == max && cur > maxRem))) {
                    return Integer.MAX_VALUE;
                }
                if (flag == -1 && (res > min || (res == min && cur > minRem))) {
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + cur;
                index++;
            }
        } else
            return 0;
        return res * flag;
    }

    public static void main(String[] arsg) {
        new StringToInteger().myAtoi(new String("  -0012a42"));
    }
}
