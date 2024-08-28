class Solution {
    private void sumHelper(List<List<Integer>> result, List<Integer> currComb, int[] candidates, int remTarget,
            int sInd) {
        if (remTarget == 0) {
            result.add(new ArrayList<>(currComb));
            return;
        }

        for (int i = sInd; i < candidates.length; i++) {
            if (candidates[i] <= remTarget) {
                currComb.add(candidates[i]);
                sumHelper(result, currComb, candidates, remTarget - candidates[i], i);
                currComb.remove(currComb.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        sumHelper(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
}