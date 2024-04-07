package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Lessons_154539 { // 154539번, 뒤에 있는 큰 수 찾기
	static int[] numbers = {9, 1, 5, 3, 6, 2};
	static int[] answer = new int[numbers.length];
	public static void main(String[] args) {
			
		Stack<Integer> st = new Stack<Integer>();
		Arrays.fill(answer, -1);
		st.push(0);
		
		for (int i = 1; i < numbers.length; i++) {
            while (!st.isEmpty() && numbers[st.peek()] < numbers[i]) {
//            	System.out.println("i : " + i + ", " + st.peek() + " ~ing");
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
//            System.out.println("i : " + i + ", " + st.toString() + "~last");

        }
		
	}
	
	private static int[] answer1() {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if((numbers[i] < numbers[j])) {
					answer[i] = numbers[j];
					break;
				}
				
				if(j == numbers.length - 1) {
					answer[i] = -1;
				}
				
			}
		}
		
		answer[numbers.length - 1] = -1;
		return answer;
	}
}
