package easy;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean isValid = true;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && (!set.add("row" + i + board[i][j]) || !set.add("col" + j + board[i][j])
						|| !set.add("block" + i / 3 + "-" + j / 3 + board[i][j])))
					return false;
			}
		}
		return isValid;
	}
}
