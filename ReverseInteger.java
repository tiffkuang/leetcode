class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0){
            int digit = x % 10;
            System.out.println("digit:" + digit);
            reverse = (reverse * 10) + digit;
            System.out.println("reverse:" + reverse);
            
            if (reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) {
                return 0;
            }
            x /= 10;
            System.out.println("x:" +x);
        }
        
        return reverse;
        // testcase: 1534236469, -2147483412
        
    }
}