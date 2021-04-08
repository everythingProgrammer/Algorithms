package backtraking;

public class NQueens2 {
	
	
	
	
	/*place queens such that 1 queen is placed in 1 row 
	 * for eg for a 4*4 matrix with 4 queens we have 4^4 combinations = 256
	 * so here everytime we place a queen we go to next row not to next coloumn 
	 * when we run out of rows to change then we change the coloumn */
	static int count = 0;
	public static void NQueens2(boolean board[][] , int row   , int qpsf, int tq ,String ans) {
		
		
			if(qpsf == tq) {
				System.out.println(++count+" "+ans);
				return;
			}
			
			if(row == board.length) {
				return;
			}
			
			for(int col = 0;col<board[0].length; col++) {
				board[row][col] = true;
				NQueens2(board, row+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
				board[row][col] =false;
			}
		
	}
	public static void main(String argsp[]) {
		NQueens2(new boolean[4][4], 0, 0, 4, "");
	}
	
}
