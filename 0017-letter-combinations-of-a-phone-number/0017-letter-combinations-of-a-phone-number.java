class Solution {
    private static final String[] KEYPAD = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    private void combHelper(List<String> result, StringBuilder currComb, String digits, int index) {
        if (index == digits.length()) {
            result.add(currComb.toString());
            return;
        }

        int currDig = digits.charAt(index) - '0';
        String letters = KEYPAD[currDig];

        for (char l : letters.toCharArray()) {
            currComb.append(l);
            combHelper(result, currComb, digits, index + 1);
            currComb.deleteCharAt(currComb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        combHelper(result, new StringBuilder(), digits, 0);
        return result;
    }
}