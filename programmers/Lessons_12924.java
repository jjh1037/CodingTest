package programmers;

public class Lessons_12924 {
	public static void main(String[] args) { // 12924번, 숫자의 표현
		int n = 15;
		int answer = 0;
		
		for(int i = 1; i <= n/2; i++) {
			int startNum = i;
			int sum = 0;
			
			while(sum <= n) {
				sum += startNum;
				if(sum == n) {
					answer++;
					break;
				}
				startNum++;
			}
		}
		
		System.out.println(answer);
		
	}
}
