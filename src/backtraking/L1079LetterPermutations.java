package backtraking;
import java.util.*;

/*not workings*/

public class L1079LetterPermutations {
	public static int numTilePossibilities(String tiles) {
//        int size = countPossibilities(tiles).size();
        ArrayList<String> rec = countPossibilities(tiles);
        HashSet<String> abc = new HashSet<>();
        for(String r:rec) {
        	abc.add(r);
        	
        }
        System.out.println(rec.size());
        return abc.size();
    }
	
	private static ArrayList<String> countPossibilities(String str) {
		if(str.length() ==1) {
			ArrayList<String> st= new ArrayList<>();
			st.add(str);
			return st;
		}
		String cc = str.substring(0, 1);
		ArrayList<String> st = countPossibilities(str.substring(1));
		ArrayList<String> nt = new ArrayList<>();
		nt.add(cc);
		for(String rs:st) {
			String ss = rs+cc;
			nt.add(ss);
			ss = cc+rs;
			nt.add(ss);
		}
		for(String rs : st) {
			nt.add(rs);	
		}
		return nt;
		
	}
	
	public static void main(String args[]) {
		numTilePossibilities("AAABBC");
	}
}
