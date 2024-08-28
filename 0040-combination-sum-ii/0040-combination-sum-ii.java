class Solution {
    private void sumHelper(List<List<Integer>> result, List<Integer> currComb, int[] cnd, int remTarget, int startI) {
        if (remTarget == 0) {
            result.add(new ArrayList<>(currComb));
            return;
        }

        for (int i = startI; i < cnd.length; i++) {
            if (i > startI && cnd[i] == cnd[i - 1])
                continue;
            if (remTarget - cnd[i] >= 0) {
                currComb.add(cnd[i]);
                sumHelper(result, currComb, cnd, remTarget - cnd[i], i + 1);
                currComb.remove(currComb.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        sumHelper(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
}