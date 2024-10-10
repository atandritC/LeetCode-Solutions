class Solution {
    public long maximumTotalSum(int[] maxH) {
        Arrays.sort(maxH);
        long result = maxH[maxH.length - 1];

        for (int i = maxH.length - 2; i >= 0; i--) {
            if (maxH[i] >= maxH[i + 1])
                maxH[i] = maxH[i + 1] - 1;
            if (maxH[i] <= 0)
                return -1;

            result += maxH[i];
        }

        return result;
    }
}