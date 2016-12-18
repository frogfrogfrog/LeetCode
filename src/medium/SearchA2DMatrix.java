package medium;

/**
 * Created by 42160 on 2016/12/18.
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return false;
    }
}
