public class BestTimeToBuyStocks {
    public int maxProfit(int[] prices) {
        int min = 999999;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }         
        return max; 
    }
}
