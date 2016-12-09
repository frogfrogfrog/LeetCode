package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        s = s.toUpperCase();
        int res = 0;
        char[] list = s.toCharArray();
        int size = list.length;
        for (int i = 0; i < size - 1; i++) {
            if (map.get(list[i]) < map.get(list[i + 1]))
                res -= map.get(list[i]);
            else
                res += map.get(list[i]);
        }
        res += map.get(list[size - 1]);
        return res;
    }
}
