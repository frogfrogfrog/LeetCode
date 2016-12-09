package easy;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countM = new int[26];
        for (char a : magazine.toCharArray()) {
            countM[a - 'a']++;
        }
        for (char a : ransomNote.toCharArray()) {
            if (--countM[a - 'a'] < 0)
                return false;
        }
        return true;
    }
}
