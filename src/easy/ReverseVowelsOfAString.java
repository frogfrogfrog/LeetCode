package easy;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        int size = ss.length;
        int low = 0, high = size - 1;
        while (low < high) {
            if (isVowel(ss[low]) && isVowel(ss[high])) {
                char tmp = ss[low];
                ss[low] = ss[high];
                ss[high] = tmp;
                low++;
                high--;
            }
            while (!isVowel(ss[low]) && low < size - 1)
                low++;
            while (!isVowel(ss[high]) && high > 0)
                high--;
        }
        return new String(ss);
    }

    public boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A'
                || a == 'E' || a == 'I' || a == 'O'
                || a == 'U')
            return true;
        return false;
    }
}
