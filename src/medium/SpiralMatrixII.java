package medium;

/**
 * Created by 42160 on 2016/12/9.
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int row1 = 0, row2 = n - 1;
        int col1 = 0, col2 = n - 1;
        int count = 1;
        while (true) {
            for (int i = col1; i <= col2; i++) {
                res[row1][i] = count;
                count++;
            }
            row1++;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = row1; i <= row2; i++) {
                res[i][col2] = count;
                count++;
            }
            col2--;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = col2; i >= col1; i--) {
                res[row2][i] = count;
                count++;
            }
            row2--;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = row2; i >= row1; i--) {
                res[i][col1] = count;
                count++;
            }
            col1++;
            if (row1 > row2 || col1 > col2)
                break;
        }
        return res;
    }
}
