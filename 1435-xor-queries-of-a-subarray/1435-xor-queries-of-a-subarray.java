class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefXOR = new int[arr.length];
        prefXOR[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            prefXOR[i] = prefXOR[i - 1] ^ arr[i];

        int[] result = new int[queries.length];
        for (int i = 0; i < result.length; i++)
            result[i] = (queries[i][0] == 0 ? prefXOR[queries[i][1]]
                    : prefXOR[queries[i][0] - 1] ^ prefXOR[queries[i][1]]);

        return result;
    }
}