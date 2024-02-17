class Solution {
    public int solution(String my_string) { // 숨어있는 숫자의 덧셈 (2)
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", " ");
        String[] array = my_string.split(" ");
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals("")) {
			}else {
				answer += Integer.parseInt(array[i]); 
			}
		}
        return answer;
    }
}
