class Solution {
    public int longestSubarray(int[] nums) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            maxEle = Math.max(maxEle, nums[i]);

        int result = 1, subArrLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxEle)
                subArrLen++;
            else {
                result = Math.max(result, subArrLen);
                subArrLen = 0;
            }
        }
        result = Math.max(result, subArrLen);

        return result;
    }
}