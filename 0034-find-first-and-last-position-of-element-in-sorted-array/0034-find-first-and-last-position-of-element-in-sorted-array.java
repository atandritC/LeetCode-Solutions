class Solution {
    private int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        if (nums == null || nums.length == 0)
            return result;

        int midI = binarySearch(nums, target);
        if (midI == -1)
            return result;

        int firstI = midI, lastI = midI;
        while (firstI >= 0 && nums[firstI] == target)
            firstI--;
        while (lastI < nums.length && nums[lastI] == target)
            lastI++;

        result[0] = (firstI < 0 ? 0 : firstI + 1);
        result[1] = lastI - 1;

        return result;
    }
}