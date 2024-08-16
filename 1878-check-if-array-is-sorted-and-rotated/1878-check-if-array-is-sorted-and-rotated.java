class Solution {
    public boolean check(int[] nums) {
        int counter = 1, ind = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                ind = i;
                break;
            }
        }

        while (counter < nums.length) {
            if (ind == nums.length)
                ind = 0;

            if (ind == nums.length - 1) {
                if (nums[ind] > nums[0])
                    return false;
            } else if (nums[ind] > nums[ind + 1])
                return false;

            ind++;
            counter++;
        }

        return true;
    }
}