package backtraking;
import java.util.*;
public class L216_CombinationSUM3 {
	
	
	 public static List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> ans = new ArrayList<>();
	        findCombinations(0,k,9,1, n, new ArrayList<>(), ans);
	        System.out.println(ans);
	        return ans;
	 }
	
	 //nusf = numbers used so far 
	 // tn - k numbers that can be used 
	 // target - 9 - maximum number that can be used 
	 // curr - current number
	 public static void findCombinations(int nusf, int tn, int target, int curr,int sum ,ArrayList<Integer> ca, List<List<Integer>> ans) {
		 if( nusf == tn && sum == 0 ) {
			 ans.add(new ArrayList<>(ca));
		 }
		 else if( nusf >= tn || sum<0) {
			 return;
		 }
		 
		 
		 
		 //place
		 for(int i = curr; i<=target; i++) {
			 if(sum -i <0) {
				 break;
			 }
			 ca.add(i);
			 findCombinations(nusf+1, tn , target, i+1, sum-i,ca,ans);
			 ca.remove(ca.size()-1);
		 }
		 
	 }
	 public static void main(String args[]) {
		 combinationSum3(3,9);
	 }
	
	
}
