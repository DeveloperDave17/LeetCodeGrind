import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapFromNumToIndex = new HashMap<>();
        // caching num.length speeds up the loop.
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
          int complement = target - nums[i];
          if (mapFromNumToIndex.containsKey(complement)) {
            return new int[]{mapFromNumToIndex.get(complement), i};
          }
          mapFromNumToIndex.put(nums[i], i);
        }
        return new int[0];
    }
}
