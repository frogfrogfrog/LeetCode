package hard;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	List<List<String>> res = new ArrayList<List<String>>();

	public List<List<String>> solveNQueens(int n) {
		res.clear();
		char[][] ans = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[i][j] = '.';
			}
		}
		this.findSolotions(new int[4][2 * n + 1], ans, 0, n);
		return res;
	}

	private void findSolotions(int[][] flags, char[][] ans, int row, int n) {
		if (row == n) {
			ArrayList<String> solotion = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				solotion.add(new String(ans[i]));
			}
			res.add(solotion);
			return;
		}
		for (int col = 0; col < n; col++) {
			if (flags[0][row] == 0 && flags[1][col] == 0 && flags[2][col + row] == 0
					&& flags[3][n - row - 1 + col] == 0) {
				ans[row][col] = 'Q';
				flags[0][row] = 1;
				flags[1][col] = 1;
				flags[2][col + row] = 1;
				flags[3][n - row - 1 + col] = 1;
				findSolotions(flags, ans, row + 1, n);
				ans[row][col] = '.';
				flags[0][row] = 0;
				flags[1][col] = 0;
				flags[2][col + row] = 0;
				flags[3][n - row - 1 + col] = 0;
			}
		}
	}

}
