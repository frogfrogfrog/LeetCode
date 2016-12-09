package easy;

import java.util.*;
import java.util.Map.Entry;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        Set<Character> set = new HashSet<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.remove(chars[i]);
                set.add(chars[i]);
            }
            if (!set.contains(chars[i]))
                map.put(chars[i], i);
        }
        if (map.entrySet().size() == 0)
            return -1;
        Iterator<Integer> it = map.values().iterator();
        return it.next();
    }

    public static void main(String[] args) {
        Map<Integer, Character> map = new LinkedHashMap<Integer, Character>();
        map.put(1, 'z');
        map.put(0, 'd');
        map.put(2, 'c');
        for (Entry<Integer, Character> d : map.entrySet()) {
            System.out.println(d.getKey());
            System.out.println(d.getValue());
        }
    }
}
