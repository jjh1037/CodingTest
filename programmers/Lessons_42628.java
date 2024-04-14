package programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lessons_42628 {
	public static void main(String[] args) { // 42628번, 이중우선순위큐
//		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		Queue<Integer> queue2 = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < operations.length; i++) {
			String[] spilt = operations[i].split(" ");
			
			switch (spilt[0]) {
			case "I": 
				queue.add(Integer.parseInt(spilt[1]));
				queue2.add(Integer.parseInt(spilt[1]));
				break;
			case "D":
				if(queue.isEmpty()) break;
				
				if(spilt[1].equals("-1")) {
					int num = queue.poll();
					queue2.remove(num);
				}else {
					int num = queue2.poll();
					queue.remove(num);
				}
				
				break;
			}
		}
		
		
		
	}
}
