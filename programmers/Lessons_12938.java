package programmers;


public class Lessons_12938 {
	public static void main(String[] args) { // 12938번, 최고의 집합
		int n = 2;
		int s = 9;
		
		if(n > s) {
			int[] answer = {-1};
			
		}else {
			int[] answer = new int[n];
			int extra = s % n;
			
			for(int i = 0; i < n; i++) {
				answer[i] = s / n;
			}

			int maxIdx = n - 1;
			while(extra != 0) {
				answer[maxIdx]++;
				maxIdx--;
				extra--;
			}
			
		}
		
		
	}
}
