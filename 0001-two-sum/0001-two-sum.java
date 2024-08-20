class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[2];

        int currKey = 0;
        for (int i = 0; i < nums.length; i++) {
            currKey = target - nums[i];

            if (mp.containsKey(currKey)) {
                res[0] = i;
                res[1] = mp.get(currKey);
                return res;
            }

            mp.put(nums[i], i);
        }

        return res;
    }
}