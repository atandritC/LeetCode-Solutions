class Solution {
    private int firstIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int fInd = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                fInd = mid;
                high = mid - 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return fInd;
    }

    private int lastIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int lInd = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lInd = mid;
                low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return lInd;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        if (nums == null || nums.length == 0)
            return result;

        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);

        return result;
    }
}