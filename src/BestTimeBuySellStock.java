
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int preMin = Integer.MAX_VALUE;
        int max = 0;
        int diff = 0;
        for(int i = 0; i < prices.length; ++i) {
        	if(prices[i] < preMin){
        		preMin = prices[i];
        	}
        	diff = prices[i] - preMin;
        	if(diff > max){
        		max = diff;
        	}
        }
        return max;	
    }
}
