package programmers;

public class Lessons_120924 { // 다음에 올 숫자
	public static void main(String[] args) {
		int[] common = {2, 4, 8};
		int answer = 0;
		
		if(common[0] - common[1] == common[1] - common[2]) {
			answer = common[common.length - 1] + (common[1] - common[0]); 
		}else {
			answer = common[common.length - 1] * (common[1] / common[0]); 
		}
		
		System.out.println(answer);
	}
}
