package backtraking;
import java.util.*;
public class L78_Subsets {
	
	
	 public static List<List<Integer>> subsets(int[] nums) {
	        
		 List<List<Integer>>ans = new ArrayList<>();
		 uniqueElements(nums,0,new ArrayList<Integer>(),ans);
		 System.out.println(ans);
		return ans; 
		 
	 }
	 public static void uniqueElements(int nums[] , int curr, ArrayList<Integer>ca ,List<List<Integer>>ans ) {
		 
		 ans.add(new ArrayList<>(ca));
		 
		 // need a loop here
		 for(int i = curr ; i<nums.length ; i++) {
			 // place
			 ca.add(nums[i]);
			 uniqueElements(nums , i+1, ca,ans);
			 ca.remove(ca.size() -1);
		 }
		 
	 }
	
	
	public static void main(String args[]) {
		int nums[] = {1,2,3};
		subsets(nums);
	}
	
}
