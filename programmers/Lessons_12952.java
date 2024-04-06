package programmers;

public class Lessons_12952 {
	static int answer = 0;
    static int[] queen;
    static int n = 4;
	public static void main(String[] args) {// 12952번, N-Queen
		queen = new int[n];
        
        //재귀함수
        dfs(0);
       System.out.println(answer); 
    }
    
    //재귀함수
    private static void dfs(int d) {
        if(d == n) {
            answer++;
            return;
        }
        
        for(int i = 0; i < n; i++) {
            queen[d] = i;
            if(isPossible(d)) {
                dfs(d + 1);
            }
        }
    }
    
    //배치가능여부
    private static boolean isPossible(int d) {
        for(int i = 0; i < d; i++) {
            if(queen[i] == queen[d]) return false;
            if(Math.abs(d - i) == Math.abs(queen[d] - queen[i])) return false;
            
        }   
        return true;
	}
}
