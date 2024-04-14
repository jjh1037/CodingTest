package programmers;

public class Lessons_12979 {
	public static void main(String[] args) { // 12979번 , 기지국 설치
		int n = 16;  
		int[] stations = {9}; 
		int w = 2;
		int answer = 0;
		
        int dong = 1;
        int idx = 0;
        
        while(dong <= n) {
            if(idx < stations.length && dong >= stations[idx] - w) {
                dong = stations[idx++] + w + 1;
            }else {
                dong += w * 2 + 1;
                answer++;
            }
        }
		
	}
}
