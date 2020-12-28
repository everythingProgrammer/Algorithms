package arrays;


/*	https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/ */
public class MoveNegatives {
	
	public static void moveNegatives(int nums[]) {
		int seg = 0 ; 
		
		for(int i = 0 ; i<nums.length ; i++) {
			if( nums[i] < 0) {
				int temp = nums[i];
				nums[i] = nums[seg];
				nums[seg] = temp;
				seg++;
				
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {-1,2,3,5,-6,-8,41,-25,-63};
		moveNegatives(arr);
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}
