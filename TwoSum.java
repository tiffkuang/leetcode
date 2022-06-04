import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // must return the indices of two numbers that add up to target
        int answer[] = new int[2];
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
        // to add to hashmap, use name.put(int, int);
        // to access, use the get() method
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (visited.get(target-val) != null) {
                answer[0] = i;
                answer[1] = visited.get(target-val);
            }
            else {
                visited.put(val, i);
            }
        }
        return answer;   
    }
}