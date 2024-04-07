package programmers;

public class Lessons_87390 {
	
	public static void main(String[] args) { // 87390번, n^2 배열 자르기
		int n = 3;
		long left = 2; 
		long right = 5;
//		int[] answer = new int[(int)(right - left) + 1];
//		
//		int[] arr = new int[n * n];
//		int cnt = 0;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				arr[cnt++] = Math.max(i+1, j+1);
//			}
//		}
//		
//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = arr[(int)left + i];
//			System.out.println(answer[i]);
//		}
//		==================================================
		
		int[] answer = new int[(int)(right - left) + 1];
		
		int idx = 0;
		for(long i = left; i <= right; i++) {
			answer[idx++] = (int)Math.max(i/n+1, i%n+1);
		}
		
		
		
	}
}
