package programmers;
import java.util.*;

public class Lessons_150370 {
	public static void main(String[] args) { // 150370번, 개인정보 수집 유효기간
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"}; 
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		
		//terms를 K, V로 나눔
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < terms.length; i++) {
			map.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2, terms[i].length())));
		}
		
		//오늘날씨를 일자로 변환
		String[] ymd = today.split("\\.");
		int dates = (Integer.parseInt(ymd[0]) - 2000)*28*12
						+ Integer.parseInt(ymd[1])*28
						+ Integer.parseInt(ymd[2]);
		
		//privacies를 날짜와 term으로 나눔
		int[] privaciesDate = new int[privacies.length];
		int cnt = 0;
		for(String a : privacies) {
			a = a.replaceAll(" ", ".");
			String[] ymd2 = a.split("\\.");
			privaciesDate[cnt] = (Integer.parseInt(ymd2[0]) - 2000)*28*12
					+ Integer.parseInt(ymd2[1])*28
					+ Integer.parseInt(ymd2[2])
					+ map.get(ymd2[3])*28;
			cnt++;
		}
		
		//오늘날짜-privacy날짜 >= term * 28보다 크면 answer++
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < privaciesDate.length; i++) {
			if(dates - privaciesDate[i] >= 0) {
				list.add(i+1);
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		for(int a : list) {
			System.out.println(a);
		}
	}
}
