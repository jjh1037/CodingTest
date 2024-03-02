package programmers;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120897 {
	public static void main(String[] args) { // 약수 구하기
		int n = 24;
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				arr.add(i);
			}
		}
		
		int[] answer = new int[arr.size()];
		
		for(int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		System.out.println(arr.toString());
	}
}
