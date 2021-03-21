package stringAlgorithms;
import java.util.*;
public class NaivePatternMatching {
	
	
	public static void main(String args[]) {
		
		
		String text = "aabaaacaadaabaaba";
		String pat = "aaba";
		search(text,pat);
	}
	private static void search(String text, String pat) {
		int N = text.length();
		int M = pat.length();
		
		for(int i = 0 ; i<N-M; i++) {
			int j ;
			for( j = 0; j<M; j++) {
				if(pat.charAt(j)!= text.charAt(i+j)) {
					break;
				}
			}
			if(j == M) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
}
