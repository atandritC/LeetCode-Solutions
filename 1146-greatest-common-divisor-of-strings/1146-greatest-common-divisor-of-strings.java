class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.equals(""))
            return str1;

        if (str2.length() > str1.length())
            return gcdOfStrings(str2, str1);

        if (str1.startsWith(str2))
            return gcdOfStrings(str2, str1.substring(str2.length()));

        return "";
    }
}