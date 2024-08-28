class Solution {
    private void ssHelper(List<List<Integer>> result, List<Integer> currSS, int[] nums, int index) {
        result.add(new ArrayList<>(currSS));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            currSS.add(nums[i]);
            ssHelper(result, currSS, nums, i + 1);
            currSS.remove(currSS.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        ssHelper(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
}