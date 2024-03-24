package programmers;

public class Lessons_250125 {
	public static void main(String[] args) { // 250125번, 이웃한 칸
//		00 01 02 03
//		10 11 12 13
//		20 21 22 23
//		30 31 32 33
//			 -1 0(x == 0, 0X)
//		0 -1(y == 0, 1X)		0 +1(y == 3, 2X)
//			 +1 0(x == 3, 3X)
		String[][] board = {{"blue", "red", "orange", "red"}, 
				{"red", "red", "blue", "orange"}, 
				{"blue", "orange", "red", "red"}, 
				{"orange", "orange", "red", "blue"}} ;
		int h = 1;
		int w = 1;
		int answer = 0;
		
		int[] dx= {-1, 0, 0, 1};
		int[] dy= {0, -1, 1, 0};
		String color = board[h][w];
		
		for(int i = 0; i < 4; i++) {
			int x = h + dx[i];
			int y = w + dy[i];
			
			if(x < 0 || y < 0 || x > board.length -1 || y > board.length -1) continue;
			
			if(board[x][y].equals(color)) answer++;
		}
		
		System.out.println(answer);
	}
}
