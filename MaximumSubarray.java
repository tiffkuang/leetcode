class Solution {
    public int maxSubArray(int[] nums) {
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
            // if all elements in array are negative
            if (nums[i] > maxInt) {
                maxInt = nums[i];
            }
        }
        // if all elements in array are negative, it should return the largest
        // if there is at least one 0 or positive element, then it will return the
        // largest sum, rather than largest int
        if (maxInt < 0) {
            return maxInt;
        }
        return Math.max(newSum, maxSum);
    }
}