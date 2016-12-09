package medium;

public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int max = 0;
        int length = words.length;
        int[] masks = new int[length];
        for (int i = 0; i < length; i++) {
            String tmp = words[i];
            for (int j = 0; j < tmp.length(); j++) {
                masks[i] |= (1 << (tmp.charAt(j) - 'a'));
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((masks[i] & masks[j]) == 0 && words[i].length() * words[j].length() > max)
                    max = words[i].length() * words[j].length();
            }
        }
        return max;
    }
}
