class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenInd = 0, oddInd = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[evenInd] = nums[i];
                evenInd += 2;
            } else {
                result[oddInd] = nums[i];
                oddInd += 2;
            }
        }

        return result;
    }
}