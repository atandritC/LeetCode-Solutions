class Solution {
    private void sumHelper(List<List<Integer>> result, List<Integer> valComb, int remK, int remT, int startN) {
        if (remT == 0 && remK == 0) {
            result.add(new ArrayList<>(valComb));
            return;
        }

        for (int i = startN; i <= 9; i++) {
            if (remT - i >= 0) {
                valComb.add(i);
                sumHelper(result, valComb, remK - 1, remT - i, i + 1);
                valComb.remove(valComb.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        sumHelper(result, new ArrayList<Integer>(), k, n, 1);
        return result;
    }
}