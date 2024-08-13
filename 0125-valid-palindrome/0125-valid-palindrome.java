class Solution {
    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int start, int last) {
        if (start >= last)
            return true;

        while (start < s.length() && !Character.isLetterOrDigit(s.charAt(start)))
            start++;
        while (last > 0 && !Character.isLetterOrDigit(s.charAt(last)))
            last--;

        if (start == s.length())
            return true;

        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last)))
            return false;
        return isPalindrome(s, start + 1, last - 1);
    }
}