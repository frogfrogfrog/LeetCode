package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        char[] patternList = pattern.toCharArray();
        String[] strList = str.split(" ");
        if (patternList.length != strList.length)
            return false;
        Map<Character, String> map = new HashMap<Character, String>();
        int size = patternList.length;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(patternList[i])) {
                if (!map.get(patternList[i]).equals(strList[i]))
                    return false;
            } else {
                if (map.containsValue(strList[i]))
                    return false;
                map.put(patternList[i], strList[i]);
            }
        }
        return true;
    }
}
