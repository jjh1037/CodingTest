package programmers;

import java.util.Arrays;

public class Lessons_12941 { // 12941번, 최솟값 만들기
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		int answer = 0;
		
		Arrays.sort(A); // 1, 2, 4
		Arrays.sort(B); // 4, 4, 5
		
		for(int i = 0; i < A.length; i++) {
			answer+=(A[i] * B[A.length - i - 1]);
		}
		
		System.out.println(answer);
	}
}
