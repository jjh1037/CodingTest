package programmers;

public class Lessons_12949 {
	public static void main(String[] args) { // 12949번, 행렬의 곱셈
//		2 3 2   5 4 3   00 01 02 10 11 12
//		4 2 4   2 4 1
//		3 1 4   3 1 1
//		
//		00 01 02
//		10 11 12
//		20 21 22
		
		int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
		int[][] arr2 = {{3, 3}, {3, 3}};
		
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				for(int k = 0; k < arr1[0].length; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
	}
}









