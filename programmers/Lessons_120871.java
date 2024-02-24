package programmers;

class Solution {
    public int solution(int n) { // 저주의 숫자 3
			int answer = 0;
			for(int i = 0; i < n; i++) {
				while(true) {
					answer++;
					if(answer % 3 == 0) {
						continue;
					}else if(Integer.toString(answer).contains("3")) {
						continue;
					}else {
                        break;
					}
					
				}
			}
        return answer;
    }
}
