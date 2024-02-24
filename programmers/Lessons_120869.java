package programmers;

class Solution { // 외계어 사전
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int spellCheck = 0;
		boolean isFin = true;
		
		for(int i = 0; i < dic.length; i++) {
			spellCheck = 0;
			for(int j = 0; j < spell.length; j++) {
				if(dic[i].contains(spell[j])) {
					spellCheck++;
				}
			}
			if(spellCheck == spell.length) {
				isFin = false;
				break;
			}
		}
		if(isFin) {
			answer = 2;
		}else {
            answer = 1;
        }
        return answer;
    }
}
