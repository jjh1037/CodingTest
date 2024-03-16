package programmers;

import java.util.HashMap;
import java.util.Map;

public class Lessons_118666 {

	public static void main(String[] args) { // 성격 유형 검사하기, 118666번
//		1	매우 비동의
//		2	비동의
//		3	약간 비동의
//		4	모르겠음
//		5	약간 동의
//		6	동의
//		7	매우 동의
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		String answer = "";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);
		
		for(int i = 0; i < survey.length; i++) {
			int a = map.get(survey[i].charAt(0));
			int b = map.get(survey[i].charAt(1));
			
			switch (choices[i]) {
			case 1:
				map.put(survey[i].charAt(0), a + 3);
				break;
			case 2:
				map.put(survey[i].charAt(0), a + 2);
				break;
			case 3:
				map.put(survey[i].charAt(0), a + 1);
				break;
			case 4: 
				break;
			case 5:
				map.put(survey[i].charAt(1), b + 1);
				break;
			case 6:
				map.put(survey[i].charAt(1), b + 2);
				break;
			case 7:
				map.put(survey[i].charAt(1), b + 3);
				break;
			}
		}
		
		if(map.get('R') >= map.get('T')) {
			answer += "R";
		}else {
			answer += "T";
		}
		
		if(map.get('C') >= map.get('F')) {
			answer += "C";
		}else {
			answer += "F";
		}
		
		if(map.get('J') >= map.get('M')) {
			answer += "J";
		}else {
			answer += "M";
		}
		
		if(map.get('A') >= map.get('N')) {
			answer += "A";
		}else {
			answer += "N";
		}
		
		System.out.println(map.toString());
		System.out.println(answer);
		
	}

}
