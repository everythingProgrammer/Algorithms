package branchandbound;

/* Session32 0.00 - 2.12    SelectionSort ....*/

public class SelectionSort {
	
	public static void main(String args[]) {
		int one[] = {10,30,50,80,100,200};
		int two[] = {15,20,25,60,70};
		int res[] = mergetwosortedarrays(one,two);
		for(int val:res) {
			System.out.println(val);
		}
	}
	
	
	public static int[] mergetwosortedarrays(int one[], int two[]) {
		int [] merged = new int[one.length + two.length];
		int i = 0 ;
		int j = 0;
		int k = 0;
		
		while(i < one.length && j <two.length) {
			if(one[i]<two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			}else {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		if(j == two.length) {
			while(i<one.length) {
				merged[k] = one[i];
				i++;
				k++;
			}
		}else {
			while(j<two.length) {
				 merged[k] = two[j];
				 j++;
				 k++;
			}
		}
		return merged;
	}
	
}
