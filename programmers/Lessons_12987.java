package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons_12987 {
	public static void main(String[] args) { // 12987번, 숫자 게임
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		int answer = 0;
        Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < A.length; i++) {
			if(A[answer] < B[i]) answer++;
		}
		
		System.out.println(answer);
		
		
		
		
	}
}