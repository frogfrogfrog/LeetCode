package medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by 42160 on 2016/12/24.
 */
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        int level = 1;
        int wordLength = beginWord.length();
        wordList.add(endWord);
        Queue<String> reached = new LinkedList<>();
        reached.offer(beginWord);
        while (!reached.isEmpty()) {
            int size = reached.size();
            for (int i = 0; i < size; i++) {
                String cur = reached.poll();
                for (int j = 0; j < wordLength; j++) {
                    char[] chars = cur.toCharArray();
                    for (char a = 'a'; a <= 'z'; a++) {
                        chars[j] = a;
                        String tmp = String.valueOf(chars);
                        if (tmp.equals(endWord))
                            return level + 1;
                        if (wordList.contains(tmp)) {
                            reached.add(tmp);
                            wordList.remove(tmp);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
