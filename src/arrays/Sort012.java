package arrays;


	/*Sort 0's 1's and 2's using 3 pointer approach*/
	/*A simpler approach would be to use counting method*/
public class Sort012 {
	
	
	static void sort(int nums[]) {
		int low = 0;
		int mid = 0;
		int high = nums.length -1;
		
		while(mid<=high) {
			if(nums[mid] == 0) {
				nums[mid ] = nums[low];
			    nums[low] = 0;
			    mid++;
			    low++;
			}
			else if( nums[mid] == 1) {
				mid++;
			}
			else if(nums[mid] == 2) {
				nums[mid] = nums[high];
				nums[high] = 2;
				high --;
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {0, 1, 1, 0, 1, 2, 1,0,0,0, 2, 0, 0, 0, 1};
		sort(arr);
		for(int a: arr)
			System.out.print (a+" ");
	}
	
}
