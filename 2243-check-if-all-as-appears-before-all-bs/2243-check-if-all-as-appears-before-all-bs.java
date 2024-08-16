class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && foundB)
                return false;
            else if (s.charAt(i) == 'b')
                foundB = true;
        }

        return true;
    }
}