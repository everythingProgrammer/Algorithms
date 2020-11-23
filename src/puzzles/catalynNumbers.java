package puzzles;
/* https://cp-algorithms.com/combinatorics/catalan-numbers.html */
import java.util.*;
public class catalynNumbers {
	
	public static void main (String args[]) {
		
		/*Catlyn Number series 1 1 2 5 14 42 ...*/
		/*Recursive Formula */
		
		int n = 10;
		int dp[] = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		
		for(int i = 2 ; i<=n ; i++)
		{
			for(int j = 0; j<i ; j++) {
				dp[i] += dp[j]*dp[i-j-1];
			}
		}
		
		for(int i: dp) {
			System.out.print(i+"  ");
		}
	}
	
	
}
