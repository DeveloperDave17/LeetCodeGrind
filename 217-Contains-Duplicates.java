import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> numberSet = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        int previousSetSize = numberSet.size();
        numberSet.add(nums[i]);
        if (numberSet.size() == previousSetSize) return true;
      }
      return false;
    }
}