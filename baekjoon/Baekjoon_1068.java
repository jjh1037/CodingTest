package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1068 { // 1068번 - 트리
	private static int n;
	private static int parent[];
	private static boolean visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 숫자개수
		parent = new int[n];
		visited = new boolean[n];
		sc.nextLine();
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0; i < n; i++) {
			parent[i] = Integer.parseInt(st.nextToken());
		}
		
		int rmIdx = sc.nextInt(); // 삭제할 인덱스 번호
		remove(rmIdx);
		
		int count = leafCount();
		System.out.println();
	}
	/*
	 * 삭제
	 */
	static void remove(int idx) {
		visited[idx] = true;
		for(int i = 0; i < n; i++) {
			if(parent[i] == idx) {
				remove(i);
			}
		}
	}
	
	/*
	 * 리프노드 개수
	 */
	static int leafCount() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				continue;
			}
			if(isLeaf(i)) sum++;
		}
		return sum;
	}
	
	/*
	 * 리프노드 여부
	 */
	static boolean isLeaf(int idx) {
		visited[idx] = true;
		boolean isLeaf = true;
		for(int i = 0; i < n; i++) {
			if(parent[i] == idx) {
				isLeaf = false;
				break;
			}
		}
		return isLeaf;
	}
}
