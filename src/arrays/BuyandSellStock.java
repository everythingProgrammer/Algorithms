package arrays;

public class BuyandSellStock {
	// defunctional - complexity is high and doesn't do whats needed
	 public static int maxProfitde(int[] prices) {
		 int buy = 0;
		 int sell = 0 ;
		 int max_diff = 0;
		 int num = 0;
		 //searching valley
		 int i =0;
		 while(num < prices.length) {
			 buy = 0 ;
			 sell = 0 ;
			 for( i = num; i< prices.length-1; i++)
			 {
				 if(prices[i] < prices[i+1]) {
					 buy = prices[i];
					 num = i ;
					 System.out.print ("BUY "+i);
					 break;
				 }
			 }
			 
			 for(i = num+1 ; i< prices.length-1 ; i++) {
				 if(prices[i] > prices[i+1]) {
					 sell = prices[i];
					 System.out.println("  Sell "+i);
					 break;
				 }
			 }
			 
			 if((sell - buy) > max_diff) {
				 max_diff = sell-buy;
			 }
			 num = num+1;
			 
		 }
		 
		 return max_diff;
	 }
	 
	 
	 /*we need to find lowest valley and highes peak 
	  * keep track for lowest valley and highest peak can be anything*/
	 public static int maxProfit(int[] prices) {
		 int valley = Integer.MAX_VALUE;
		 int maxProfit = 0;
		 for(int i = 0 ; i< prices.length; i++) {
			 if(prices[i]< valley) {
				 valley = prices[i];
			 }
			 else if( prices[i] - valley > maxProfit) {
				 maxProfit = prices[i] -valley;
			 }
		 }
		 return maxProfit;
	 }
	 
	 
	 public static void main(String args[]) {
		 int arr[] = {7,1,5,3,6,4};
		 System.out.println(maxProfit(arr));
	 }
}
