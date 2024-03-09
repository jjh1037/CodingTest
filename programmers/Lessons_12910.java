package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons_12910 {
	public static void main(String[] args) { // 나누어 떨어지는 숫자 배열, 12910번

		int[] answer = {-1};
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] % divisor == 0) list.add(arr[i]);
		}
		
		if(list.size() > 0) {
			answer = new int[list.size()];
		}
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
	}
}
