package backtraking;
import java.util.*;

/*Here eliminating combination of same elements is tricky*/
public class L40CombinationSum2 {
	
	 public  static List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        List<List<Integer>> ans = new ArrayList<>();
	        findUniqueCombinations(candidates, target, 0, new ArrayList<Integer> (), ans);
	        return ans;
	 }
	 
	 private static void findUniqueCombinations(int [] candidates, int target , int i , ArrayList<Integer>ds  , List<List<Integer>>ans ) {
		 if(i == candidates.length) {
			 if(target == 0) {
				 System.out.println(ds);
				 return;
			 }
			 else
				 return;
		 }
//		 if(++i == candidates.length)
		 
		 if(candidates[i] <=target) {
			 ds.add(candidates[i]);
			 findUniqueCombinations(candidates, target-candidates[i], i+1,  ds, ans);
			 ds.remove(ds.size()-1);
		 }
		 findUniqueCombinations(candidates, target, i+1, ds,ans);
	 }
	 
	public static void main(String args[]) {
		int arr[] = {2,5,2,1,2};
		combinationSum2(arr, 5);
	}
}
