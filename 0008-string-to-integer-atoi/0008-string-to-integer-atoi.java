class Solution {
    public int myAtoi(String s) {
        int ind = 0;
        int len = s.length();
        long res = 0;

        while (ind < len && s.charAt(ind) == ' ') {
            ind++;
        }

        if (ind == len) return 0;

        boolean positive = true;
        if (s.charAt(ind) == '-') {
            positive = false;
            ind++;
        } else if (s.charAt(ind) == '+') {
            ind++;
        }

        while (ind < len) {
            char c = s.charAt(ind);
            if (!Character.isDigit(c)) break;

            res = res * 10 + (c - '0');

            if (positive && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (!positive && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            ind++;
        }

        res = positive ? res : -res;

        return (int) res;
    }
}
