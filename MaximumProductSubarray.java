public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int minProduct = 1;
        int maxProduct = 1;
        int answer = -999;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            if (Math.max(maxProduct, minProduct) > answer) {
                answer = Math.max(maxProduct, minProduct);
            }
        }
        return answer;
    }
}