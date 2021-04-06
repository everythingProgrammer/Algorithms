package backtraking;

public class QueenCombination2D {
	
	
	// simple placing queens ...
	// this is extra recursive call 
	public static void QueenCombinationBoxRespect2D(boolean[][] board, int row, int col , int qpsf, int tq , String ans ) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}else if(row >= board.length ) {
			 return;
		}
		
		
		if(col<board[row].length)
		{
			//place
			board[row][col] = true;
			QueenCombinationBoxRespect2D(board, row, col+1, qpsf+1, tq, ans+" {"+row+"-"+col+"}");
			board[row][col] = false;
			
			//don't place
			QueenCombinationBoxRespect2D(board, row, col+1 , qpsf, tq , ans);
		}
		else {
			QueenCombinationBoxRespect2D(board, row+1, 0, qpsf, tq, ans);
		}
		
	}

	// this is manually changing row
	public static void QueenCombinationBoxRespect2Dcb(boolean[][] board, int row, int col , int qpsf, int tq , String ans) {
		//positive bc
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		// manually variables change
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		//negative base case 
		if(row == board.length) {
			return ;
		}
		//place 
		board[row][col]  = true;
		QueenCombinationBoxRespect2Dcb(board, row , col+1, qpsf+1 , tq , ans+" {"+row+"-"+col+"}");
		board[row][col] = false;
		QueenCombinationBoxRespect2Dcb(board, row , col+1, qpsf , tq , ans);
		
	}
	
	
	public static void main(String args[]) {
		 QueenCombinationBoxRespect2Dcb(new boolean[2][2],0,0,0,2,""); 
	}
	
	
}
