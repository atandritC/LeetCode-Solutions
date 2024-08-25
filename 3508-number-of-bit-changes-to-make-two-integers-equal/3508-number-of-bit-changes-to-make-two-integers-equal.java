class Solution {
    public int minChanges(int n, int k) {
        int diffBits = n ^ k;

        if ((n & diffBits) != diffBits)
            return -1;

        int setBits = 0;
        while (diffBits != 0) {
            diffBits &= (diffBits - 1);
            setBits++;
        }

        return setBits;
    }
}