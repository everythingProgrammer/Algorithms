package arrays;

/* https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/ */

/* Method 1 using int min and max , iterating through the loop and getting min and max*/


/*Method 2 Tournament Method : Divide the array into two parts and compare the maximums and minimums of two parts
 * this approach can be classified as divide and conquer  */
public class FindMinMax {
	
	static class Pair{
		int max;
		int min;
	}
	
	
	static Pair getMinMax(int arr[] , int low , int high) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;
		
		if(low == high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}
		/* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
 
        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);
 
        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }
 
        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }
 
        return minmax;
	
	}
	public static void main(String args[]) {
		int arr[] = {100,200,11,445,1,330};
		int len = arr.length;
		Pair minmax= getMinMax(arr, 0, len-1);
		System.out.println("Minimum element"+minmax.min);
	}
	
	
}
