package hard;

public class NQueensII {
    private int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        this.findSolotions(new int[4][2 * n + 1], 0, n);
        return count;
    }

    private void findSolotions(int[][] flags, int row, int n) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (flags[0][row] == 0 && flags[1][col] == 0 && flags[2][col + row] == 0
                    && flags[3][n - row - 1 + col] == 0) {
                flags[0][row] = 1;
                flags[1][col] = 1;
                flags[2][col + row] = 1;
                flags[3][n - row - 1 + col] = 1;
                findSolotions(flags, row + 1, n);
                flags[0][row] = 0;
                flags[1][col] = 0;
                flags[2][col + row] = 0;
                flags[3][n - row - 1 + col] = 0;
            }
        }
    }

}
