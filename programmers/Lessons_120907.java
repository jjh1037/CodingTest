package programmers;

public class Lessons_120907 { // OX퀴즈
	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] m = new String[quiz.length];
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			m = quiz[i].split(" ");
			
			if(m[1].equals("+")) {
				if(Integer.parseInt(m[0]) + Integer.parseInt(m[2]) 
					==  Integer.parseInt(m[4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
			}else {
				if(Integer.parseInt(m[0]) - Integer.parseInt(m[2]) 
						==  Integer.parseInt(m[4])) {
					answer[i] = "O";
				}else {
					answer[i] = "X";
				}
			}
		}
		for(String str : answer) {
			System.out.println(str);
		}
	}
}
