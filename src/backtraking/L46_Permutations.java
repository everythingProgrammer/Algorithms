package backtraking;
import java.util.*;
public class L46_Permutations {
	/*To keep track of numbers in array use boolean array . 
	 * eazy*/
	
	
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans  = new ArrayList<>();
		boolean arr[] = new boolean[nums.length];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = true;
		}
		 calcp(nums, arr, ans, new ArrayList<>());
		return ans;
    }
	
	public static void calcp(int nums[], boolean arr[] , List<List<Integer>> ans , List<Integer>curr) {
		
		if(curr.size() == nums.length) {
			ans.add(new ArrayList<>(curr));
			return;
		}
		
		
		for(int i = 0 ; i<nums.length; i++) {
			if(arr[i] ) {
				arr[i] = false;
				curr.add(nums[i]);
				calcp(nums, arr ,ans, curr);
				curr.remove(curr.size()-1);
				arr[i] = true;
			}
		}
		
	}
	public static void main (String args[]) {
		int arr[] = {1,1,2};
		System.out.println(permute(arr));
	}
}
