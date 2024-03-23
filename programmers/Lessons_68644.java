package programmers;
import java.util.*;

public class Lessons_68644 {
	public static void main(String[] args) { // 68644번, 두 개 뽑아서 더하기
		int[] numbers = {9,10,1,2};
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i +
					1; j <numbers.length; j++ ) {
				set.add(numbers[i] + numbers[j]); 
			}
		}

		Iterator<Integer> iter = set.iterator();
		int[] answer = new int[set.size()]; 
		int a = 0;
		while(iter.hasNext()) {
			answer[a] = iter.next();
			a++;
		}
		
		Arrays.sort(answer);
		for(int b : answer) { // 출력
			System.out.println(b);
		}
	}
}
