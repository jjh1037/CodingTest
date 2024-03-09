package programmers;

public class Lessons_12912 {
	public static void main(String[] args) { // 두 정수 사이의 합, 12912번
		int a = 5;
		int b = 3;
		long answer = 0;
		int temp = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) {
			answer += i;
		}
		
		
	}
}
