package programmers;

public class Lessons_12945 {
	public static void main(String[] args) { // 12945번, 피보나치 수
		int n = 7;
		int[] arr = new int[n + 1]; // 0 1 2 3 4 5
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < n + 1; i++) { // 2 3 4 5
			arr[i] = (arr[i -2] + arr[i - 1]) % 1234567;
		}
		
		System.out.println(arr[n]);
	}
}
