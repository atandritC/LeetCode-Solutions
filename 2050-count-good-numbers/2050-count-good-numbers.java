class Solution {
    private static final int M = 1000000007;

    private int modExp(int base, long exp) {
        int result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (int) ((1L * result * base) % M);
            base = (int) ((1L * base * base) % M);
            exp >>= 1;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        if (n == 1)
            return 5;

        if ((n & 1) == 0)
            return modExp(20, n >> 1);
        else
            return (int) ((5L * modExp(20, n >> 1)) % M);
    }
}