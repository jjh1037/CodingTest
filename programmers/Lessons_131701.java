package programmers;

import java.util.HashSet;
import java.util.Set;

public class Lessons_131701 {
	public static void main(String[] args) { // 131701번, 연속 부분 수열 합의 개수
//		0 1 2 3 4
//		01 12 23 34 40
//		012 123 234 340 401
//		0123 1234 2340 3401 4012
//		01234
		int[] elements = {7,9,1,1,4};
		
		
		int[] count = new int[elements.length * 2];
		
		for(int i = 0; i < count.length; i++) {
			if(i >= elements.length) 
				count[i] = elements[i - elements.length];
			else 
				count[i] = elements[i];
			
//			System.out.println(count[i]);
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int k = 0; k < elements.length; k++) {
			for(int i = 0; i < elements.length; i++) {
				int cal = 0; 
				cal += count[i];
				
				for(int j = 1; j < k + 1; j++) {
					cal += count[i + j];
				}
				
				set.add(cal);
				if(k == elements.length - 1 ) break;
			}
		}

		System.out.println(set.toString());
		System.out.println(set.size());
		
	}
}
