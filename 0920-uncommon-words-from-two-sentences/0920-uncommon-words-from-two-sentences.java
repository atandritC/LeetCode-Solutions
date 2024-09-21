class Solution {
    private void processSentence(String sent, Map<String, Integer> wordCount) {
        String[] words = sent.split(" ");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCount = new HashMap<>();

        processSentence(s1, wordCount);
        processSentence(s2, wordCount);

        List<String> result = new ArrayList<>();
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1)
                result.add(word);
        }

        return result.toArray(new String[result.size()]);
    }
}