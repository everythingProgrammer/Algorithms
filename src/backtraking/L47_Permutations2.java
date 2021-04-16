package backtraking;
import java.lang.reflect.Array;
import java.util.*;
public class L47_Permutations2 {
	
	/*Permutations in an array without duplicates !*/
	/*for duplicate numbers there should be no duplicate */
	
	 public static List<List<Integer>> permuteUnique(int[] nums) {
		 List<List<Integer>> ans  = new ArrayList<>();
			boolean arr[] = new boolean[nums.length];
			for(int i = 0 ; i<arr.length ; i++) {
				arr[i] = true;
			}
			Arrays.sort(nums);
			 permutation(nums, arr, ans, new ArrayList<>());
			return ans;
	 }
	 
	 public static void permutation(int arr[] , boolean[] available , List<Integer> curr, List<List<Integer>>ans) {
		 if(curr.size() == arr.length) {
			 ans.add(new ArrayList<>(curr));
			 return;
		 }
		 for(int i = 0 ; i<available.length ; i++) {
			 if(available[i] == false) {
				 continue;
			 }
			 if(arr[i] == arr[i-1] && i > 0 && available[i-1]) {
				 continue;
			 }
			 available[i] = false;
			 curr.add(arr[i]);
			 permutation(arr, available, curr, ans);
			 curr.remove(curr.size()-1);
			 available[i] = true;
		 }
	 }
	 
	 
	 public static void main (String args[]) {
			int arr[] = {1,1,2};
			System.out.println(permuteUnique(arr));
		}
	
}
