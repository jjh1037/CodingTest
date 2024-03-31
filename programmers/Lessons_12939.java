package programmers;

import java.util.Arrays;

public class Lessons_12939 {
	public static void main(String[] args) { // 12939번, 최댓값과 최솟값
		String s = "1 2 3 4";
		
		String[] a = s.split(" ");
		int[] arr = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			arr[i] = Integer.parseInt(a[i]);
		}
		
		Arrays.sort(arr);
		String answer =	String.format("%d %d", arr[0], arr[arr.length - 1]);
		
		System.out.println(answer);
	}
}
