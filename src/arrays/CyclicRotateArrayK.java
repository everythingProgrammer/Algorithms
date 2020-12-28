package arrays;

/* https://leetcode.com/problems/rotate-array/solution/*/
/*Cyclic Rotate Array by k */


/*3 Ways to approach this problem */


public class CyclicRotateArrayK {
	
	/*1. Brute Force way 
	 * 
	 * To shift all the elements to right one by one 
	 * 
	 * 
	 * Time complexity = O(n*k) - number of elements X number of rotations */
	public static void bruteForce(int nums[] , int k ) {
		/*Because it's a cycle*/
		k%=nums.length;
		
		int temp, previous;
		
		for(int i = 0 ;i<k ; i++) {
			
			previous = nums[nums.length -1];
			for(int j = 0; j<nums.length ; j++) {
				temp =  nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}	
	}
	
	/*2. Using Extra Array*/
	/* We calculate the position of every element using formula =  (i+k)%nums.length
	 * */
	/* Time complexity is O(n) but space complexity is O(n) as well...  */
	public static void rotate(int nums[], int k) {
		int a[] = new int[nums.length];
		for(int i =0; i<nums.length; i++) {
			a[ (i+k)%nums.length ] = nums[i];
		}
		for(int i = 0 ; i<nums.length ; i++) {
			nums[i] = a[i];
		}
	}
	
	/*3. Using Cyclic Replacements.*/
	
	
	
	/*4.   There's also a method of "reversing" in which we'll reverse all the numbers
	 * according to the pattern which we know will exist.
	 * 
	 * */
}
