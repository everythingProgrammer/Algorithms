package arrays;

public class BuyansSell2 {
	
	
	public int maxProfit(int[] prices) {
		int profit = 0;
		int i = 0;
		int valley = 0;
		int peak = 0;
		while(i < prices.length-1) {
			while(  i< prices.length-1 && prices[i] >= prices[i+1]) {
				i++;
			}
			valley = prices[i];
			
			while( i< prices.length -1 && prices[i] < prices[i+1]) {
				i++;
			}
			
			peak = prices[i];
			
			profit = profit + (peak -valley);
		}
		
		return profit;
	}

	
	
}
