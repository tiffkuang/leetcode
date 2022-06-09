class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int newSum = 0;
        for (int i = 0; i < nums.length; i++) {
            newSum += nums[i];
            if (newSum > maxSum) {
                maxSum = newSum;
            }
            if (newSum < 0) {
                newSum = 0;
            }
        }
        return maxSum;  
    }
}