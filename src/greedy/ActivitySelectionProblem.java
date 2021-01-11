package greedy;


/*The greedy choice is to always pick the next activity whose finish time is least among the remaining activities and the start
 *  time is more than or equal to the finish time of previously selected activity. */


//	1) Sort the activities according to their finishing time 
//	2) Select the first activity from the sorted array and print it. 
//	3) Do following for remaining activities in the sorted array.

public class ActivitySelectionProblem {
	
	public int printMaxActivities(int s[] , int f[] )
	{
		 // The first activity always gets selected
		int i = 0, j;
		int count =1; 
		for( j =  1; j< f.length; j++ ) {
			if(s[j] >= f[i]) {
				count++;
				i = j;
			}
		}
		System.out.println(count);
		return count;
	}
	
	
	
}
