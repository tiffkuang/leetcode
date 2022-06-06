import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // create hashmap and add each number to it
        // if it is alread added, then we will return true
        // else we will return false
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.get(nums[i]) == null) {
                visited.put(nums[i], true);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
