package programmers;

import java.util.HashMap;
import java.util.Map;

public class Lessons_258712 {
	public static void main(String[] args) { // 258712번, 가장 많이 받은 선물 
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for(int i = 0; i < friends.length; i++) {
//			map.put(friends[i], 0);
//		}
//		
//		int[] index = new int[friends.length];
//		int[][] exchange = new int[friends.length][friends.length];
//		
//		for(String names : gifts) {
//			String[] name = names.split(" ");
//			exchange[map.get(name[0])][map.get(name[1])]++;
//			index[map.get(name[0])]++;
//			index[map.get(name[1])]--;
//		}
		
		//선물 지수
		Map<String, Integer> giveGift = new HashMap<String, Integer>();
		Map<String, Integer> getGift = new HashMap<String, Integer>();
		for(String name : friends) {
			giveGift.put(name, 0);
			getGift.put(name, 0);
		}
		
		for(String names : gifts) {
			String[] name = names.split(" ");
			giveGift.replace(name[0], giveGift.get(name[0]) + 1);
			getGift.replace(name[1], getGift.get(name[1]) + 1);
		}
		
		Map<String, Integer> giftIndex = new HashMap<String, Integer>();
		for(String name : friends) {
			giftIndex.put(name, giveGift.get(name) - getGift.get(name));
		}
		//
		
		// 받을 선물 수 체크
		Map<String, Integer> idk = new HashMap<String, Integer>();
		for(int i = 0; i < friends.length; i++) {
			for(int j = 0; j < friends.length; j++) {
				if(i == j) {
					continue;
				}else {
					idk.put(friends[i] + " " + friends[j], 0);
				}
			}
		}
		
		for(String names : gifts) {
			idk.replace(names, idk.get(names) + 1);
		}
		//
		System.out.println(idk.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
