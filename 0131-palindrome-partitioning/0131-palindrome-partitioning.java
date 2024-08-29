class Solution {
    private boolean isPalin(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }

        return true;
    }

    private void ssGen(List<List<String>> result, List<String> currSS, String s, int ind) {
        if (ind == s.length()) {
            result.add(new ArrayList<>(currSS));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            if (isPalin(s, ind, i)) {
                currSS.add(s.substring(ind, i + 1));
                ssGen(result, currSS, s, i + 1);
                currSS.remove(currSS.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        ssGen(result, new ArrayList<String>(), s, 0);
        return result;
    }
}