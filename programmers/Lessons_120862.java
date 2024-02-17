import java.util.*;
class Solution { // 최댓값 만들기(2)
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {   
                list.add(numbers[i] * numbers[j]);
            }
        }
        answer = Collections.max(list);
        return answer;
    }
}
