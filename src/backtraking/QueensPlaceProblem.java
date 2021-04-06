package backtraking;
import java.util.*;
public class QueensPlaceProblem {
	
	public static boolean isItSafeToPlace(boolean board[][], int row, int col) {
		if(row>= board.length || col>= board[0].length) {
			return false;
		}
		
		// check in same row
		for(int i = col ;i>= 0 ; i--) {
			if(board[row][i] == true) {
				return false;
			}
		}
		// check in same coloumn 
		for(int i = row; i>=0; i--) {
			if(board[i][col] == true) {
				return false;
			}
		}
		// check in same diagonal backwards  
	
		for(int i = row,  j = col ; i>=0 && j>=0; i--,j--) {
			if(board[i][j] == true) {
				return false;
			}
		}
		// check in same digonal forward 
		for(int i = row,  j = col ; i>=0 && j<board[0].length; i--,j++) {
			if(board[i][j] == true) {
				return false;
			}
		}
		return true;
	}
	
	
	// place queens such that they cannot attack each other.
	public static void placeQueens(boolean board[][], int row, int col , int qpsf , int tq , String ans) {
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
				if(row >= board.length) {
					return ;
				}
		
		
		//place only if it is safe
		if(isItSafeToPlace(board, row, col)) {
			board[row][col] = true;
//			placeQueens(board, row+1, 0 , qpsf+1, tq,ans+" {"+row+"-"+col+"}");
			placeQueens(board, row, col+1 , qpsf+1, tq,ans+" {"+row+"-"+col+"}");
			// upper two lines are the same 
			
			
			board[row][col] = false;
		}
		
		
		//not place
		placeQueens(board, row, col+1, qpsf, tq, ans);
		
		
	}
	
	public static void main(String args[]) {
		 placeQueens(new boolean[5][5],0,0,0,5,""); 
	}
	
}
