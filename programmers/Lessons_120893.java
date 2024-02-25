package programmers;

class Solution { // 대문자와 소문자
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
			if(Character.isLowerCase(arr[i])) {
				sb.append(Character.toUpperCase(arr[i]));
			}else {
                sb.append(Character.toLowerCase(arr[i]));
			}
		}
        return sb.toString();
    }
}
