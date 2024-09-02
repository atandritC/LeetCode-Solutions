class Solution {
    public String decodeString(String s) {
        Stack<Integer> nStack = new Stack<>();
        Stack<String> sStack = new Stack<>();
        StringBuilder currS = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            else if (c == '[') {
                nStack.push(num);
                sStack.push(currS.toString());
                currS = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int rC = nStack.pop();
                StringBuilder tempS = new StringBuilder(sStack.pop());
                while (rC > 0) {
                    tempS.append(currS);
                    rC--;
                }
                currS = tempS;
            } else
                currS.append(c);
        }

        return currS.toString();
    }
}