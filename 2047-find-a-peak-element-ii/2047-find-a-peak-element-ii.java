class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int[] result = { -1, -1 };
            int maxEle = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (maxEle < mat[i][mid]) {
                    maxEle = mat[i][mid];
                    result[0] = i;
                    result[1] = mid;
                }
            }

            int lE = (mid - 1 >= 0 ? mat[result[0]][mid - 1] : -1);
            int rE = (mid + 1 < n ? mat[result[0]][mid + 1] : -1);

            if (lE < mat[result[0]][mid] && rE < mat[result[0]][mid])
                return result;

            if (lE > mat[result[0]][mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return new int[] { -1, -1 };
    }
}