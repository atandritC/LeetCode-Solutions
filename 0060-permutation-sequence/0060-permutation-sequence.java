class Solution {
    private int factorial(int n) {
        if (n <= 1)
            return 1;

        return factorial(n - 1) * n;
    }

    private void permHelper(List<Integer> nums, StringBuilder result, int k) {
        if (nums.size() == 0)
            return;

        int distribution = factorial(nums.size() - 1);
        int index = (k - 1) / distribution;

        result.append(nums.get(index));
        nums.remove(index);

        permHelper(nums, result, k - index * distribution);

    }

    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++)
            nums.add(i);

        permHelper(nums, result, k);

        return result.toString();
    }
}