class Solution {
    private int josWinner(int n, int k) {
        if (n == 1)
            return 0;

        return (josWinner(n - 1, k) + k) % n;
    }

    public int findTheWinner(int n, int k) {
        return josWinner(n, k) + 1;
    }
}