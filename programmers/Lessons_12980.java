package programmers;

public class Lessons_12980 {
	public static void main(String[] args) { // 12980번, 점프와 순간 이동
		int n = 1; // n이 0이 아닐때 까지 줄인다
		int ans = 0;

		if(n == 1) {
            System.out.println(n);
            System.exit(0);
        } else {
            while(n != 2) {
                if(n % 2 == 0) {
                    n /= 2;
                }else {
                    n -= 1;
                    ans++;
                }
		    }
		    ans++;
        }
		
		System.out.println(ans);
	}
}
