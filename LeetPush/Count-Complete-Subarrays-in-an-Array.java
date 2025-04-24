import java.util.*;
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int totalDistinct = getDistinctCount(nums);
        int n = nums.length;
        int count = 0;

        for (int start = 0; start < n; start++) {
            Set<Integer> seen = new HashSet<>();
            for (int end = start; end < n; end++) {
                seen.add(nums[end]);
                if (seen.size() == totalDistinct) {
                    count++;
                }
            }
        }

        return count;
    }

    private int getDistinctCount(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }
}