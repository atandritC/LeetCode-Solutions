class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();

        int year = 0;
        for (int i = 0; i < 4; i++)
            year = year * 10 + (date.charAt(i) - '0');
        int month = 0;
        for (int i = 5; i < 7; i++)
            month = month * 10 + (date.charAt(i) - '0');
        int day = 0;
        for (int i = 8; i < 10; i++)
            day = day * 10 + (date.charAt(i) - '0');

        for (int i = 31; i >= 0; i--) {
            int k = year >> i;
            if ((k & 1) > 0)
                result.append(1);
            else if (result.length() > 0)
                result.append(0);
        }
        result.append('-');

        StringBuilder temp = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int k = month >> i;
            if ((k & 1) > 0)
                temp.append(1);
            else if (temp.length() > 0)
                temp.append(0);
        }
        result.append(temp);
        result.append('-');

        temp.setLength(0);
        for (int i = 31; i >= 0; i--) {
            int k = day >> i;
            if ((k & 1) > 0)
                temp.append(1);
            else if (temp.length() > 0)
                temp.append(0);
        }
        result.append(temp);

        return result.toString();
    }
}