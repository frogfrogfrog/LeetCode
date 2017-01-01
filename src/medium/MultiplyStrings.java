package medium;

/**
 * Created by 42160 on 2017/1/1.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        String res = "";
        int size1 = num1.length(), size2 = num2.length();
        if (size1 == 0 || size2 == 0)
            return res;
        int[] ans = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                int tmp = (num1.charAt(size1 - i - 1) - '0') * (num2.charAt(size2 - j - 1) - '0');
                int sum = ans[i + j] + tmp;
                ans[i + j] = sum % 10;
                ans[i + j + 1] += sum / 10;
            }
        }
        int i = size1 + size2 - 1;
        while (i > 0 && ans[i] == 0)
            i--;
        while (i >= 0) {
            res += (char) (ans[i] + '0');
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        new MultiplyStrings().multiply("1", "1");
    }
}
