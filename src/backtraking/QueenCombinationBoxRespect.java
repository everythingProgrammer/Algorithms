package backtraking;
import java.util.*;
public class QueenCombinationBoxRespect {
	
	public static void QueenCombinationBoxRespect(boolean board[] , int col , int qpsf, int tq , String ans ) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// negative bc
		if(col == board.length) {
			return;
		}
		
		
		// place
		board[col] = true;
		QueenCombinationBoxRespect(board ,col+1, qpsf+1, tq , ans+ " b"+col );
		board[col ] = false;
		QueenCombinationBoxRespect(board, col+1, qpsf, tq , ans);
	}
	public static void main(String args[]) {
		QueenCombinationBoxRespect(new boolean[4], 0,0,2,"");
	}
	
}
