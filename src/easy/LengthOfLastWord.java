package easy;

/**
 * Created by 42160 on 2016/12/6.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println("sfedfe adfe ".split(" ")[2]);
    }

    public int lengthOfLastWord(String s) {
        int lastLength = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            lastLength++;
        }
        return lastLength;
    }
}
