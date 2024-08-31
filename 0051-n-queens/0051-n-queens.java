class Solution {
    private void nQueens(List<List<String>> result, List<String> valSol, boolean[] column, boolean[] mainDiag,
            boolean[] antiDiag, int n, int row) {
        if (row == n) {
            result.add(new ArrayList<>(valSol));
            return;
        }

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

            nQueens(result, valSol, column, mainDiag, antiDiag, n, row + 1);

            valSol.remove(valSol.size() - 1);

            column[col] = false;
            mainDiag[mdI] = false;
            antiDiag[adI] = false;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[] column = new boolean[n];
        boolean[] mainDiag = new boolean[2 * n - 1];
        boolean[] antiDiag = new boolean[2 * n - 1];
        nQueens(result, new ArrayList<String>(), column, mainDiag, antiDiag, n, 0);
        return result;
    }
}