import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charactersInS = s.toCharArray();
        for (char character: charactersInS) {
            int previousValue = charCountMap.getOrDefault(character, 0);
            int newValue = previousValue + 1;
            charCountMap.put(character, newValue);
        }

        char[] charactersInT = t.toCharArray();
        for (char character: charactersInT) {
            int previousValue = charCountMap.getOrDefault(character, 0);
            int newValue = previousValue - 1;
            charCountMap.put(character, newValue);
        }

        for (int value : charCountMap.values()) {
            if (value != 0) return false;
        }
        return true;
    }
}