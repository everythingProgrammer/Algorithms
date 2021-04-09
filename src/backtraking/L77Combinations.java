package backtraking;
import java.util.*;
public class L77Combinations {
	
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(n,1,0,k,new ArrayList<>(), ans);
        System.out.println(ans);
        return ans;
    }
	
	public static void findCombination(int target, int curr , int psf, int k, ArrayList<Integer>ca, List<List<Integer>>ans) {
		if(psf == k) {
			ans.add(new ArrayList<>(ca));
			System.out.println(ca);
			return;
		}
		
		if(curr>target) {
			return;
		}
		
		//place
		for(int i = curr; i<= target; i++) {
			ca.add(i);
			findCombination(target, i+1, psf+1, k ,ca, ans);
			ca.remove(ca.size()-1);
		}
	}
	
	public static void main(String args[]) {
		combine(1,1);
	}
}
