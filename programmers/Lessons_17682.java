package programmers;


public class Lessons_17682 {

	public static void main(String[] args) { // [1차] 다트 게임, 17682 
		String a = "1S2D*3T";
		int result = 0;
		char[] dartResultArr = a.toCharArray();
//		Single(S), Double(D), Triple(T)
//		Math.pow(0, 0) 제곱식
//		'*'는 앞과 자신 곱하기 2
//		'#'는 자신의 점수 곱하기 -1
		double[] score = new double[3];
		int scoreCount = 0; 
		
//		i - 1 은 점수
//		i + 1은 옵션
//		첫번째 자리가 0일 경우 OutOfRange -> 0번째 인덱스가 0이면 다 제외
		
		for(int i = 0; i < dartResultArr.length; i++) {
			if(dartResultArr[i] == 'S' || dartResultArr[i] == 'D' || dartResultArr[i] == 'T') {
				if(i == 1 && dartResultArr[0] == '0') continue;
				
				switch (dartResultArr[i]) {
				case 'S': 
					score[scoreCount] = changeNum(dartResultArr, i);
					break;
				case 'D':
					score[scoreCount] = Math.pow(changeNum(dartResultArr, i), 2);
					break;
				case 'T':
					score[scoreCount] = Math.pow(changeNum(dartResultArr, i), 3);
					break;
				}
				
				if(dartResultArr.length != i+1) {
					switch (dartResultArr[i+1]) {
					case '*':
						if(scoreCount == 0) {
							score[0] *= 2;
						}else {
							score[scoreCount] *= 2;
							score[scoreCount-1] *= 2;
						}
						break;
					case '#': 
						score[scoreCount] *= -1;
						break;
					default:
						break;
					}
					scoreCount++;
				}
			}
			
		}
		
		for(int i = 0; i < score.length; i++) {
			result += score[i];
		}
		
		System.out.println(result);
	}
	
	static int changeNum(char[] dartResultArr , int i) {
		if(i == 1) {
			return (int)dartResultArr[i-1] - 48;
		}else if(dartResultArr[i-2] == '1') {
			return 10;
		}else {
			return (int)(dartResultArr[i-1]) - 48;
		}
	}
}
