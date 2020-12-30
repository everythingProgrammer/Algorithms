package arrays;


	/*	How can we prove that at least one duplicate number must exist in nums? 
		Can you solve the problem without modifying the array nums?
		Can you solve the problem using only constant, O(1) extra space?
		Can you solve the problem with runtime complexity less than O(n2)?*/


/* 1  to modify array elements ( *-1) and when we encounter any -ve array element that index is repeated so ... */
/* 2  sort the array and check for duplicates .  */
/* 3  use set  time and space complexity O(n) */


/* 4 - Floyd's Tortoise and Hare (Cycle Detection algorithm) 
 * 
 *  - similar to finding duplicate node in linkedlist. Same fast pointer and slow pointer 
 *    but here insted of slow = root and fast = root.next.next (somewhat) 
 *    we have hare = nums[nums[hare]] tortoise= nums[tortoise] 
 * 
 * */

/*Proof is PigeonHole Principal 
 * https://www.geeksforgeeks.org/discrete-mathematics-the-pigeonhole-principle/ */


public class FindDuplicate {
	
	
	public static int findDuplicate2(int nums[]) {

		
		for(int i = 0 ; i<nums.length ; i++) {
			
			if(nums[ Math.abs(nums[i])]>0) {
				nums[ Math.abs(nums[i]) ] = nums[Math.abs(nums[i])]*-1;
			}
			else 
				return Math.abs(nums[i]);	
		}
		return 0;
	}
	
	public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        
        tortoise = nums[tortoise];
        hare = nums[nums[hare]];
        
        while(tortoise!=hare){
            tortoise= nums[tortoise];
            hare = nums[nums[hare]];
        }
        
        tortoise = nums[0];
        
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }
	
	

	public static void main(String args[]) {
		int nums[] = {1,2,3,3,4,5};
	    System.out.println(findDuplicate2(nums));
	}
	
}
