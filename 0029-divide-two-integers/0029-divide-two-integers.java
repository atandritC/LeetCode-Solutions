class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == divisor)
            return 1;

        boolean sign = (divisor > 0) ^ (dividend > 0);
        long divs = Math.abs((long) divisor);
        long divd = Math.abs((long) dividend);

        long result = 0;
        while (divs <= divd) {
            long count = 0;
            while (divd >= (divs << (count + 1)))
                count++;

            divd -= (divs << count);
            result += 1L << count;
        }

        return (sign ? 0 - (int) result : (int) result);
    }
}