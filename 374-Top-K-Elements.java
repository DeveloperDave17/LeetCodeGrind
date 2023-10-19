import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
          frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
          numSet.add(nums[i]);
        }

        List<Integer> values = frequencyMap.values().stream().sorted().toList();
        int passableIndex = values.size() - k;

        int[] result = new int[k];
        int cnt = 0;
        for (Integer num: numSet) {
          if (cnt == k) break;
          if (frequencyMap.get(num) >= values.get(passableIndex)) {
            result[cnt] = num;
            cnt++;
          }
        }
        return result;
    }
}