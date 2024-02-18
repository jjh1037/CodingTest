import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str); // String 분리
			String cmd = st.nextToken();
			switch(cmd) {
			case "push":
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(queue.isEmpty()) {
//					System.out.println(-1);
					sb.append(-1).append("\n");
				}else {
//					System.out.println(queue.poll());
					sb.append(queue.poll()).append("\n");
				}
				break;
			case "size":
//				System.out.println(queue.size());
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
//					System.out.println(1);
					sb.append(1).append("\n");
				}else {
//					System.out.println(0);
					sb.append(0).append("\n");
				}
				break;
			case "front":
				if(queue.isEmpty()) {
//					System.out.println(-1);
					sb.append(-1).append("\n");
				}else {
//					System.out.println(queue.getFirst());
					sb.append(queue.getFirst()).append("\n");
				}
				break;
			case "back":
				if(queue.isEmpty()) {
//					System.out.println(-1);
					sb.append(-1).append("\n");
				}else {
//					System.out.println(queue.getLast());
					sb.append(queue.getLast()).append("\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
