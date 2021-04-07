package backtraking;

public class Nknights {
	static int count = 0;
	// simply place knight without kill constraint
	public static void placeKnightsCombinations(boolean board[][],int row , int col, int kpsf, int tk , String ans) {
		
		if(kpsf == tk) {
			System.out.println(++count+" "+ans);
			return;
			
		}
		
		if(col>= board[row].length) {
			row++;
			col = 0;
		}
		if(row>= board.length) {
			return;
		}
		// place the knight
		board[row][col] = true;
		placeKnightsCombinations(board, row, col+1, kpsf+1, tk, ans+"{"+row+"-"+col+"}");
		board[row][col] = false;
		
		// skip the col 
		placeKnightsCombinations(board, row, col+1 , kpsf , tk , ans);
		
	}
	
	
	public static boolean safeToPlaceKnight(boolean board[][] , int row, int col) {
		int []rowArr = {-1,-2,-2,-1};
		int []colArr = {2,1,-1,-2};
		for(int i = 0  ; i<4; i++) {
			int r = row + rowArr[i];
			int c = col + colArr[i];
			if(r>=0 && r<board.length && c>=0 && c<board[0].length) {
				if(board[r][c] == true) {
					return false;
				}	
			}	
		}
		return true;
	}
	
	public static void placeKnightsWithoutAttack(boolean board[][], int row , int col , int kpsf, int tk , String ans) {
		if(kpsf == tk) {
			System.out.println(++count +". "+ans);
			return; 
		}
		if(col == board[0].length) {
			row++;
			col = 0;
		}
		if(row >= board.length) {
			return;
		}
		
		//place
		if(safeToPlaceKnight(board, row, col)) {
			board[row][col] = true;
			placeKnightsWithoutAttack(board , row, col+1, kpsf+1, tk, ans+"{"+row+"-"+col+"}");
			board[row][col] = false;
		}
		//not place
		placeKnightsWithoutAttack(board, row, col+1 , kpsf, tk , ans);
		
	}
	
	
	public static void main(String args[]) {
		placeKnightsCombinations(new boolean[3][3], 0,0,0,3,"");
		System.out.println("********************************************");
		count = 0;
		placeKnightsWithoutAttack(new boolean[3][3], 0,0,0,3,"");
	}
	
}
