package backtraking;

public class CoinsCombination {
	
	public static void CoinChangeCombinationRespectCoin(int denom[],int vidx,int amount, String ans  ) {
		
		if(amount< 0 || vidx>= denom.length) {
			return;
		}else if(amount== 0) {
			System.out.println(ans);
			return;
		}
		
		//yes
		CoinChangeCombinationRespectCoin(denom, vidx, amount-denom[vidx] , ans+" "+denom[vidx]);
		
		//no
		CoinChangeCombinationRespectCoin(denom , vidx+1, amount, ans);
	}


	
}
