package backtraking;

public class QueenCombination2D {
	
	
	// simple placing queens ...
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
			QueenCombinationBoxRespect2D(board, row, col+1, qpsf+1, tq, ans+" b"+qpsf+" r-"+row+" c-"+col);
			board[row][col] = false;
			
			//don't place
			QueenCombinationBoxRespect2D(board, row, col+1 , qpsf, tq , ans);
		}
		else {
//			board[row][col] = true;
			QueenCombinationBoxRespect2D(board, row+1, 0, qpsf, tq, ans);
//			board[row][col] = false;
		}
		
	}
	public static void main(String args[]) {
		 QueenCombinationBoxRespect2D(new boolean[2][2],0,0,0,2,""); 
	}
	
	
}
