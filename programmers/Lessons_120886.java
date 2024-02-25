package programmers;

import java.util.Arrays;

class Solution { // A로 B 만들기
    public int solution(String before, String after) {
        char[] arr = new char[before.length()];
		char[] arr2 = new char[after.length()];
        
        for(int i = 0; i < before.length(); i++) {
			arr[i] = before.charAt(i);
			arr2[i] = after.charAt(i);
		}
        Arrays.sort(arr);
		Arrays.sort(arr2);
        
        String aa = new String(arr);
		String bb = new String(arr2);
		
		return aa.equals(bb) ? 1 : 0;
    }
}
