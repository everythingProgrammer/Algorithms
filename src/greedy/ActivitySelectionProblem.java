package greedy;

public class ActivitySelectionProblem {
	
	public int printMaxActivities(int s[] , int f[] )
	{
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
