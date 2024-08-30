class Solution {
  private boolean searchHelper(
      char[][] board, String word, int i, int r, int c) {
    if (i == word.length())
      return true;
    if (r < 0 || r >= board.length || c < 0 || c >= board[0].length
        || board[r][c] != word.charAt(i))
      return false;

    char temp = board[r][c];
    board[r][c] = '*';

    boolean found = searchHelper(board, word, i + 1, r + 1, c)
        || searchHelper(board, word, i + 1, r, c + 1)
        || searchHelper(board, word, i + 1, r - 1, c)
        || searchHelper(board, word, i + 1, r, c - 1);

    board[r][c] = temp;

    return found;
  }

  public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (searchHelper(board, word, 0, i, j))
          return true;
      }
    }

    return false;
  }
}