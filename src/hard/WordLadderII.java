package hard;

import java.util.*;

/**
 * Created by 42160 on 2016/12/25.
 */
public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, Set<String>> preMap = new HashMap<String, Set<String>>();
        int wordLength = beginWord.length();
        wordList.add(endWord);
        wordList.remove(beginWord);
        Queue<String> reached = new LinkedList<>();
        reached.offer(beginWord);
        boolean isEnd = false;
        while (!reached.isEmpty() && isEnd == false) {
            int size = reached.size();
            Set<String> toDelete = new HashSet<>();
            for (int i = 0; i < size; i++) {
                String cur = reached.poll();
                for (int j = 0; j < wordLength; j++) {
                    char[] chars = cur.toCharArray();
                    for (char a = 'a'; a <= 'z'; a++) {
                        chars[j] = a;
                        String tmp = String.valueOf(chars);
                        if (tmp.equals(endWord)) {
                            isEnd = true;
                        }
                        if (wordList.contains(tmp)) {
                            if (preMap.get(tmp) == null) {
                                Set<String> list = new HashSet<>();
                                list.add(cur);
                                preMap.put(tmp, list);
                            } else {
                                Set<String> list = preMap.get(tmp);
                                list.add(cur);
                                preMap.put(tmp, list);
                            }
                            toDelete.add(tmp);
                        }
                    }
                }
            }
            if (toDelete.isEmpty())
                return res;
            reached.addAll(toDelete);
            wordList.removeAll(toDelete);
        }
        dfsAns(endWord, beginWord, preMap, res, new LinkedList<String>());
        return res;
    }

    public void dfsAns(String cur, String beginWord, Map<String, Set<String>> preMap, List<List<String>> res, LinkedList<String> ans) {
        Set<String> list = preMap.get(cur);
        ans.addFirst(cur);
        if (cur.equals(beginWord))
            res.add(new ArrayList<>(ans));
        if (list != null) {
            for (String str : list) {
                dfsAns(str, beginWord, preMap, res, ans);
            }
        }
        ans.remove(cur);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee");
        Set<String> wordList = new HashSet<>(list);
        new WordLadderII().findLadders("red", "tax", wordList);
    }
}
