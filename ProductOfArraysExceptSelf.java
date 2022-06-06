public class ProductOfArraysExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // FASTER METHOD:
        // loop through once and multiply them all together
        // divide end product by answer[i]
        
        int totalProduct = 1;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // wrong because total product will be 0 as long as an element in num is 0
            totalProduct = totalProduct * nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                answer[j] = 0;
            }
            else {
                answer[j] = totalProduct/nums[j];
            }
        }
        return answer;
    }
}
