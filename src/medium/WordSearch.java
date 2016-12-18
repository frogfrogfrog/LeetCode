package medium;

/**
 * Created by 42160 on 2016/12/18.
 */
public class WordSearch {
    static boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        boolean exist = false;
        int m = board.length, n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && search(board, word, 0, i, j, m, n))
                    return true;
            }
        }
        return exist;
    }

    public boolean search(char[][] board, String word, int start, int i, int j, int m, int n) {
        if (start == word.length())
            return true;
        if (i >= m || j >= n || i < 0 || j < 0 || visited[i][j] || board[i][j] != word.charAt(start))
            return false;

        visited[i][j] = true;
        if (search(board, word, start + 1, i, j + 1, m, n) ||
                search(board, word, start + 1, i, j - 1, m, n) ||
                search(board, word, start + 1, i + 1, j, m, n) ||
                search(board, word, start + 1, i - 1, j, m, n)) {
            return true;

        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] s = new char[][]{{'a', 'b', 'c', 'e'}, {'s', 'f', 'c', 's'}, {'a', 'd', 'e', 'e'}};
        char[][] ss = new char[][]{{'a', 'a'}};
        System.out.println(new WordSearch().exist(ss, "aaa"));
        System.out.println(new WordSearch().test());
    }

    public boolean test() {
        return true || false;
    }
}
