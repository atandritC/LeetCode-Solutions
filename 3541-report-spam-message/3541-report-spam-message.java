class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bWords = new HashSet<>(Arrays.asList(bannedWords));
        Map<String, Integer> wCount = new HashMap<>();

        for (String word : message)
            wCount.put(word, wCount.getOrDefault(word, 0) + 1);

        int bwCount = 0;
        for (String word : bWords) {
            bwCount += wCount.getOrDefault(word, 0);
        }

        return bwCount >= 2;
    }
}