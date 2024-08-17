class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totSubsets = (1 << n);
        List<List<Integer>> subSets = new ArrayList<>();

        for (int mask = 0; mask < totSubsets; mask++) {
            List<Integer> currSS = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0)
                    currSS.add(nums[i]);
            }

            subSets.add(currSS);
        }

        return subSets;
    }
}