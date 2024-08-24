class Solution {
    private void soln(List<String> result, int open, int closed, StringBuilder validParen) {
        if (open == 0 && closed == 0) {
            result.add(validParen.toString());
            return;
        }

        if (open != 0) {
            if (open < closed) {
                soln(result, open - 1, closed, validParen.append('('));
                validParen.deleteCharAt(validParen.length() - 1);
                soln(result, open, closed - 1, validParen.append(')'));
                validParen.deleteCharAt(validParen.length() - 1);
            } else {
                soln(result, open - 1, closed, validParen.append('('));
                validParen.deleteCharAt(validParen.length() - 1);
            }
        } else {
            soln(result, open, closed - 1, validParen.append(')'));
            validParen.deleteCharAt(validParen.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder validParen = new StringBuilder();
        soln(result, n, n, validParen);
        return result;
    }
}