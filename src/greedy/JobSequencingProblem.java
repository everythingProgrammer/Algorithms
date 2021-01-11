package greedy;


/*	Given an array of jobs where every job has a deadline and associated profit if the job is finished before the
 *  deadline. It is also given that every job takes the single unit of time, so the minimum possible deadline for 
 *  any job is 1. How to maximize total profit if only one job can be scheduled at a time.	*/





/*	Ans 	1) Sort all jobs in decreasing order of profit. 
			2) Iterate on jobs in decreasing order of profit.For each job , do the following : 
				a)Find a time slot i, such that slot is empty and i < deadline and i is greatest.Put the job in 
				  this slot and mark this slot filled. 
				b)If no such i exists, then ignore the job. 
				
				*
				*
				*The time complexity of this is exponential
				*
				*/

public class JobSequencingProblem {
	
	
	// kafi complex code ...
	
}
