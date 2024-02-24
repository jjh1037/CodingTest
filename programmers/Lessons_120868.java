package programmers;

class Solution {
    public int solution(int[] sides) { // 삼각형의 완성조건 (2)
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        int sum = sides[0] + sides[1];
        
        answer = (sum - max) + (max - (max - min) - 1);
        
        return answer;
    }
}
