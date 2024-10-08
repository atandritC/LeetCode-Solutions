class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I')
                result++;
            else if (s.charAt(i) == 'V') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result--;
                    result += 4;
                } else
                    result += 5;
            } else if (s.charAt(i) == 'X') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result--;
                    result += 9;
                } else
                    result += 10;
            } else if (s.charAt(i) == 'L') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result -= 10;
                    result += 40;
                } else
                    result += 50;
            } else if (s.charAt(i) == 'C') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result -= 10;
                    result += 90;
                } else
                    result += 100;
            } else if (s.charAt(i) == 'D') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result -= 100;
                    result += 400;
                } else
                    result += 500;
            } else if (s.charAt(i) == 'M') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result -= 100;
                    result += 900;
                } else
                    result += 1000;
            }
        }

        return result;
    }
}