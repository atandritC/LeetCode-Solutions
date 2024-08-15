class Solution {
    public String addBinary(String a, String b) {
        if (a.equals("0"))
            return b;
        if (b.equals("0"))
            return a;

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i) - '0';
            if (j >= 0)
                sum += b.charAt(j) - '0';

            res.append(sum & 1);
            carry = sum >> 1;

            i--;
            j--;
        }

        return res.reverse().toString();
    }
}