class Solution {
    private int nQueens(List<String> valSol, boolean[] column, boolean[] mainDiag, boolean[] antiDiag, int n, int row) {
        if (row == n)
            return 1;

        int result = 0;
        for (int col = 0; col < n; col++) {
            int mdI = col - row + (n - 1);
            int adI = col + row;

            if (column[col] || mainDiag[mdI] || antiDiag[adI])
                continue;

            column[col] = true;
            mainDiag[mdI] = true;
            antiDiag[adI] = true;

            StringBuilder currRow = new StringBuilder(String.valueOf('.').repeat(n));
            currRow.setCharAt(col, 'Q');
            valSol.add(currRow.toString());

            result += nQueens(valSol, column, mainDiag, antiDiag, n, row + 1);

            valSol.remove(valSol.size() - 1);

            column[col] = false;
            mainDiag[mdI] = false;
            antiDiag[adI] = false;
        }

        return result;
    }

    public int totalNQueens(int n) {
        boolean[] column = new boolean[n];
        boolean[] mainDiag = new boolean[2 * n - 1];
        boolean[] antiDiag = new boolean[2 * n - 1];
        return nQueens(new ArrayList<String>(), column, mainDiag, antiDiag, n, 0);
    }
}