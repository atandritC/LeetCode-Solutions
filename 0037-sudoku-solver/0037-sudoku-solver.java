class Solution {
    private boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == (char) (n + '0'))
                return false;

        for (int i = 0; i < 9; i++)
            if (board[i][col] == (char) (n + '0'))
                return false;

        int sR = row - (row % 3), sC = col - (col % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (board[i + sR][j + sC] == (char) (n + '0'))
                    return false;
        }

        return true;
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int n = 1; n <= 9; n++) {
                        if (isSafe(board, i, j, n)) {
                            board[i][j] = (char) (n + '0');
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        boolean isSolvable = solve(board);
    }
}