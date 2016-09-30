package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<String,List<String>>();
        for(String s:strs){
        	char[] ch=s.toCharArray();
        	Arrays.sort(ch);
        	String sorted=new String(ch);
        	if(!map.containsKey(sorted)){
        		map.put(sorted, new ArrayList<String>());
        	}
        	map.get(sorted).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
