class Solution {
    private boolean isPossible(int[] nums, int maxSum, int k) {
        int totSA = 1, sum = 0;

        for (int i : nums) {
            if (sum + i > maxSum) {
                sum = i;
                totSA++;

                if (totSA > k)
                    return false;
            } else
                sum += i;
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {
        int low = nums[0], high = 0;
        for (int i : nums) {
            low = Math.max(low, i);
            high += i;
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, mid, k)) {
                result = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return result;
    }
}