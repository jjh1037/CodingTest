package programmers;

import java.util.*;

public class Lessons_12927 {
	public static void main(String[] args) { // 12927번, 야근 지수
		int n = 3;
		int[] works = {1,1};
		long answer = 0; 
		
		int sum = 0;

		Queue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int num : works) {
			sum += num;
			que.add(num);
		}
		
		if(sum - n <= 0) {
			answer = 0;
		}else {
			while(n != 0) {
				int idx = que.poll();
				idx--;
				n--;
				que.add(idx);
			}
			
			while(!que.isEmpty()) {
				int idx = que.poll();
				answer += idx * idx;
			}

			
		}
		
		
		
		System.out.println(answer);
		
		
		
		
		
	}
}
