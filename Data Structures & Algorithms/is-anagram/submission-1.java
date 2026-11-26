class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>(0);

        for (char sChar : s.toCharArray()) {
            charCount.put(sChar, charCount.getOrDefault(sChar, 0) + 1);
        }

        for (char tChar : t.toCharArray()) {
            charCount.put(tChar, charCount.getOrDefault(tChar, 0) - 1);
        }
        return charCount.values().stream().allMatch(v -> v == 0);
    }
}
