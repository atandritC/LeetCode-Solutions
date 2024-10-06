class Solution {
    private boolean isFeasible(int[] wh, int maxWh, int days) {
        int totDays = 1, totWh = 0;
        for (int w : wh) {
            if (totWh + w <= maxWh)
                totWh += w;
            else {
                totDays++;
                totWh = w;
            }
        }

        return totDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0], high = weights[0];
        for (int i = 1; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(weights, mid, days)) {
                result = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return result;
    }
}