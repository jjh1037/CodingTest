import java.util.ArrayList;
class Solution { 
    public int solution(int[][] board) { // 안전지대
//    	00 01 02 03 04
//    	10 11 12 13 14
//    	20 21 22 23 24
//    	30 31 32 33 34
//    	40 41 42 43 44
        int cnt = 0;
        int boardSize = board.length * board.length;
        int x[] = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int y[] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        ArrayList<int[]> a = new ArrayList<int[]>();
        for(int i = 0; i < x.length; i++) {
        		int[] k = {x[i],y[i]};
        		a.add(k);
        }
        
        ArrayList<int[]> b = new ArrayList<>();
		for(int i = 0; i < board.length; i++ ) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					int[] k = {i, j};
					b.add(k);
				}
			}
		}
		
		for(int i = 0; i < b.size(); i++) { // 폭탄 array
			for(int j = 0; j < a.size(); j++) { // 폭탄 위험지역 array
					if(b.get(i)[0] + a.get(j)[0] >= 0 
							&& b.get(i)[1] + a.get(j)[1] >= 0
							&& b.get(i)[0] + a.get(j)[0] < board.length
							&& b.get(i)[1] + a.get(j)[1] < board.length) {
						board[b.get(i)[0] + a.get(j)[0]][b.get(i)[1] + a.get(j)[1]] = 1;
				}
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					cnt++;
				}
			}
		}

        return boardSize - cnt;
    }
}
