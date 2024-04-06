package programmers;

import java.util.Stack;

public class Lessons_12973 {
	public static void main(String[] args) { // 12973번, 짝지어 제거하기
		String s = "baabaa";
		int answer = -1;
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(!st.isEmpty() && (st.peek() == s.charAt(i))) {
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
			
		}
		
		if(st.isEmpty()) answer = 1;
		else answer = 0;
		
		System.out.println(answer);
	}
}
