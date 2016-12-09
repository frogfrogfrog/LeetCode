package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    char[][] table = new char[][]{{}, {}, {'a', 'b', 'c',}, {'d', 'e', 'f',}, {'g', 'h', 'i',},
            {'j', 'k', 'l',}, {'m', 'n', 'o',}, {'p', 'q', 'r', 's',}, {'t', 'u', 'v',},
            {'w', 'x', 'y', 'z',}};
    List<String> res = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        res.clear();
        int size = digits.length();
        if (size <= 0)
            return res;
        int[] d = new int[size];
        for (int i = 0; i < size; i++) {
            d[i] = digits.charAt(i) - 48;
        }
        this.translateDigitsToLetters(d, 0, new char[size]);
        return res;
    }

    private void translateDigitsToLetters(int[] digits, int k, char[] ans) {
        if (k >= digits.length)
            res.add(String.valueOf(ans));
        else {
            for (int i = 0; i < table[digits[k]].length; i++) {
                ans[k] = table[digits[k]][i];
                translateDigitsToLetters(digits, k + 1, ans);
            }
        }
    }

    public static void main(String[] args) {
        new LetterCombinationsOfAPhoneNumber().letterCombinations("2");
    }
}
