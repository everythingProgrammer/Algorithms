package backtraking;
import java.util.*;
public class L1097_2 {
	
	/*Very specific kind of question
	 * */
	
	
	/* Making frequency array 
	 * of size 26 to store all the elements
	 * 
	 * 
	 * 
	 * */
	
	static int count ;
	public static int numTilePossibilities(String tiles) {
		
		int [] freq = new int[26];
		for(int i = 0 ; i<tiles.length(); i++) {
			char ch = tiles.charAt(i);
			freq[ch-'A']++;
		}
		count  = 0;
		
		return poss(freq, "")-1;
		
	}
	public static int poss( int freq[], String ans){
		
		
//		System.out.println(ans);
		count++;
		for(int i = 0 ; i<freq.length ; i++) {
			if(freq[i]>0) {
				freq[i]--;
				poss(freq, ans+(char)(i+'A'));
				freq[i]++;
			}
		}
		return count;
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(numTilePossibilities("AAB"));
	}
	
	
}
