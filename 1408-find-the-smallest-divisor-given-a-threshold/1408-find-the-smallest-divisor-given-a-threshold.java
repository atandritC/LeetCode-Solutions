class Solution {
    private boolean isPossible(int[] nums, int d, int th) {
        int sum = 0;
        for (int n : nums)
            sum += Math.ceil(n * 1d / d);
        return sum <= th;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;
        for (int n : nums)
            high = Math.max(high, n);

        int result = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, mid, threshold)) {
                result = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return result;
    }
}