package stringAlgorithms;
import java.util.*;
public class CheckPallindrome {
	
	
	public static boolean checkPalindrome(String str) {		
		int i = 0 ; 
		int j = str.length() -1;
		while(i<j) {
			while(i<j && !Character.isLetterOrDigit(str.charAt(i))) {
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(str.charAt(j)) ) {
				j--;
			}
			if(i<j && Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String arsg[]) {
		
		String string = "race e ,,car";
		System.out.println(checkPalindrome(string));
	}
	
	
	
}
