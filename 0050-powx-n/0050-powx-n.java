class Solution {
    private double pow(double x, int n) {
        double result = 1;

        while (n > 0) {
            if ((n & 1) != 0)
                result *= x;
            x *= x;
            n >>= 1;
        }

        return result;
    }

    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE)
            return 1 / (pow(x, Integer.MAX_VALUE) * x);

        return (n > 0 ? pow(x, n) : 1 / pow(x, -n));
    }
}