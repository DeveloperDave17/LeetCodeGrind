import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, Integer> sortedWordToListIndice = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
          char[] characters = strs[i].toCharArray();
          Arrays.sort(characters);
          String word = new String(characters);
          if (sortedWordToListIndice.containsKey(word)) {
            result.get(sortedWordToListIndice.get(word)).add(strs[i]);
          } else {
            result.add(new ArrayList<>());
            int index = result.size() - 1;
            result.get(index).add(strs[i]);
            sortedWordToListIndice.put(word, index);
          }
        }
        return result;
    }
}
