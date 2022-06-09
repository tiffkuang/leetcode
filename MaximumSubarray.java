class Solution {
    public int maxSubArray(int[] nums) {
        // check test case: [1,1,-3,-3]
        int maxInt = nums[0];
        int maxSum = 0;
        int newSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // continue to add the numbers in array to total sum
            newSum += nums[i];
            // if total sum is greater than the current max, then max is adjusted
            if (newSum > maxSum) {
                maxSum = newSum;
            }
            // if total sum is less than 0, restart new num
            if (newSum < 0) {
                newSum = 0;
            }
            // review --> if [2,2,-2]
            else if (newSum == 0 && i == nums.length - 1) {
                newSum = newSum - nums[i];
            }
            if (nums[i] > maxInt) {
                maxInt = nums[i];
            }
        }
        // if [2,2,-2], then sum should be 4, not 0
        if (newSum == 0 && nums[0] != 0) {
            return maxInt;
        }
        return maxSum;  
    }
}