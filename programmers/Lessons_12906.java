package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lessons_12906 {
	public static void main(String[] args) { // 같은 숫자는 싫어, 12906번
		int[] arr = {1,1,3,3,0,1,1};
		
		// Stack
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(stack.peek() != arr[i]) stack.push(arr[i]);
		}
		int answer[] = new int[stack.size()];
		int cnt = stack.size() - 1;
		while(!stack.isEmpty()) {
			answer[cnt--] = stack.pop();
		}
		
		// Queue
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(arr[0]);
		int last = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(last != arr[i]) {
				queue.offer(arr[i]);
				last = arr[i];
			}
		}
		
		int answer2[] = new int[queue.size()];
		int cnt2 = 0;
		while(!queue.isEmpty()) {
			answer[cnt++] = queue.poll();
		}
		
	}
}
