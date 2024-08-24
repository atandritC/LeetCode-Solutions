class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeroIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                break;
            }
        }
        if (zeroIndex == n - 1 || zeroIndex == -1)
            return;

        for (int i = zeroIndex + 1; i < n; i++) {
            if (nums[i] != 0) {
                nums[zeroIndex] ^= nums[i];
                nums[i] ^= nums[zeroIndex];
                zeroIndex++;
            }
        }
    }
}