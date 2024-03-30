package programmers;

public class Lessons_12913 {
	public static void main(String[] args) { // 12913번, 땅따먹기
		int answer = 0;
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3])); 
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3])); 
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3])); 
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2])); 
        }

        for(int i = 0; i < 4; i++){ // 마지막 행의 최대값 탐색
            answer = Math.max(answer, land[land.length-1][i]);
        }
        
        System.out.println(answer);
		
	}
}
