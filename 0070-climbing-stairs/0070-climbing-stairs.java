class Solution {
    private int soln(int n, HashMap<Integer, Integer> mp) {
        if (n <= 1)
            return 1;

        if (mp.containsKey(n))
            return mp.get(n);

        mp.put(n, soln(n - 1, mp) + soln(n - 2, mp));
        return mp.get(n);
    }

    public int climbStairs(int n) {
        return soln(n, new HashMap<Integer, Integer>());
    }
}