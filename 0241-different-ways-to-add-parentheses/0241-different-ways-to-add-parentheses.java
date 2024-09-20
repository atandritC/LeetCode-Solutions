class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                List<Integer> leftExp = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightExp = diffWaysToCompute(expression.substring(i + 1));

                for (int l : leftExp) {
                    for (int r : rightExp) {
                        if (c == '+')
                            result.add(l + r);
                        else if (c == '-')
                            result.add(l - r);
                        else if (c == '*')
                            result.add(l * r);
                    }
                }
            }
        }

        if (result.isEmpty())
            result.add(Integer.parseInt(expression));

        return result;
    }
}