package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 42160 on 2016/12/8.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0)
            return res;
        int row1 = 0, row2 = matrix.length - 1;
        int col1 = 0, col2 = matrix[0].length - 1;
        while (true) {
            for (int i = col1; i <= col2; i++) {
                res.add(matrix[row1][i]);
            }
            row1++;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = row1; i <= row2; i++) {
                res.add(matrix[i][col2]);
            }
            col2--;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = col2; i >= col1; i--) {
                res.add(matrix[row2][i]);
            }
            row2--;
            if (row1 > row2 || col1 > col2)
                break;
            for (int i = row2; i >= row1; i--) {
                res.add(matrix[i][col1]);
            }
            col1++;
            if (row1 > row2 || col1 > col2)
                break;
        }
        return res;
    }
}
