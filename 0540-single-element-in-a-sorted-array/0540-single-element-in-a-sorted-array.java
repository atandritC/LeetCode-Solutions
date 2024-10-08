class Solution {
    private int binarySearch(int[] nums, int low, int high) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;
        if (mid > 0 && mid < nums.length && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
            return nums[mid];

        return Math.max(binarySearch(nums, low, mid - 1), binarySearch(nums, mid + 1, high));
    }

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        return binarySearch(nums, 0, n - 1);
    }
}