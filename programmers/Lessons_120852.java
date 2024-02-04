package programmers;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int num = n;
        boolean flag = true;
        
//        for(int i = 2; i <=n; i++) {
//        	if(n % i == 0) {
//        		while(n % i == 0) {
//        			n /= i ;
//        		}
//        		list.add(i);
//        	}
//        }
//        
//        Collections.sort(list);
        
        while(flag) {
			for(int i = 2; i <= 10000; i++) {
				if(num == i) {
					list.add(i);
					flag = false;
				}else if(num % i == 0) {
					num = num / i;
					list.add(i);
					break;
				}
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		answer = Arrays.stream(answer).distinct().toArray();
        
        return answer;
    }
}
