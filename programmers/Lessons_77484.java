package programmers;

public class Lessons_77484 {
	public static void main(String[] args) { // 77484번, 로또의 최고 순위와 최저 순위
//		1	6개 번호가 모두 일치
//		2	5개 번호가 일치
//		3	4개 번호가 일치
//		4	3개 번호가 일치
//		5	2개 번호가 일치
//		6(낙첨)	그 외
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int min = 0;
		int max = 0;
		int[] rank = {6,6,5,4,3,2,1};
 		
		for(int i = 0; i < lottos.length; i++) {
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == 0) {
					max++;
					break;
				}else if(lottos[i] == win_nums[j]) {
					max++;
					min++;
				}
			}
		}
		
		
		
	}
}
