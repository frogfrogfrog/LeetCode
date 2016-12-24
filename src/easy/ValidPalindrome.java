package easy;

/**
 * Created by 42160 on 2016/12/24.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char lchar = s.charAt(left);
            char rchar = s.charAt(right);
            if (!Character.isLetterOrDigit(lchar))
                left++;
            else if (!Character.isLetterOrDigit(rchar))
                right--;
            else {
                if (Character.toLowerCase(lchar) != Character.toLowerCase(rchar))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((char) ('c' + 'a' - 'A'));
        System.out.println('A' - 0);
    }
}
