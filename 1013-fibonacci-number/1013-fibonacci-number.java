class Solution {
    public int fib(int n) {
        return fibHelper(n, new HashMap<Integer, Integer>());
    }

    private int fibHelper(int n, HashMap<Integer, Integer> mp) {
        if (n <= 1)
            return n;

        int currKey = n;
        if (mp.containsKey(currKey))
            return mp.get(currKey);

        mp.put(currKey, fibHelper(n - 1, mp) + fibHelper(n - 2, mp));
        return mp.get(currKey);
    }
}