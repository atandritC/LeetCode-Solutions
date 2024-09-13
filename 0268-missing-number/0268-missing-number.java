class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totSum = 0;
        for (int i = 0; i < n; i++)
            totSum += nums[i];

        return n * (n + 1) / 2 - totSum;
    }
}