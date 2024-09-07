class Solution {
    private void revArr(int[] nums, int beg, int end) {
        while (beg < end) {
            nums[beg] ^= nums[end];
            nums[end] ^= nums[beg];
            nums[beg] ^= nums[end];
            beg++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        revArr(nums, 0, nums.length - 1);
        revArr(nums, 0, k - 1);
        revArr(nums, k, nums.length - 1);
    }
}