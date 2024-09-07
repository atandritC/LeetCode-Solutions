class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int diff = 1; diff < n; diff++) {
            for (int r = diff; r < n; r++) {
                int l = r - diff;
                if (nums[l] + nums[r] == target)
                    return new int[] { l, r };
            }
        }

        return new int[0];
    }
}