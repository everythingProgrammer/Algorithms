package backtraking;
import java.util.*;
public class L1291 {
	
	public static List<Integer> sequentialDigits(int low, int high) {
        
		List<Integer> ans = new ArrayList<>();
		while(low>10) {
			low = low /10;
		}
		int begindigit = low;
		
		
		
		
    }
	public static void  generate(int low , String high , String curr , List<Integer> ans){
		if( curr.length() == high.length()  ) {
			if(Integer.parseInt(curr)<=Integer.parseInt(high)) {
				ans.add(Integer.parseInt(curr));
				return;
			}
		}
		
		for(int i = low;  ;i++ ) {
			
		}
		
		
	}
	
	
	public static void main(String args[]) {
		
		
	}
	
	
}
