package programmers;

public class Lessons_12914 {
	public static void main(String[] args) { // 12914번, 멀리 뛰기
		int n = 2;
		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i = 3; i < n + 1; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2] % 1234567);
		}
		
		System.out.println(arr[4]);
		System.out.println(arr[n - 1] % 1234567);
		System.out.println(5 % 1234567);
		
}
}