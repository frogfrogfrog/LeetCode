package medium;

/**
 * Created by 42160 on 2016/12/11.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if ((i == m - 1 || j == n - 1) && obstacleGrid[i][j] == 0) {
                    if ((i < m - 1 && dp[i + 1][j] == 0) || (j < n - 1 && dp[i][j + 1] == 0))
                        dp[i][j] = 0;
                    else
                        dp[i][j] = 1;
                } else if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];

            }
        }
        return dp[0][0];
    }
}
