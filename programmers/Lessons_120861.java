package programmers;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int max_x = board[0] / 2;
		int min_x = -(board[0] / 2);
		int max_y = board[1] / 2;
		int min_y = -(board[1] / 2);
        
        for(int i = 0; i < keyinput.length; i++) {
            
            if(keyinput[i].equals("right")) {
                if(max_x == answer[0]) {
                    continue;
                } else {
                    answer[0] += 1;
                }
            } else if(keyinput[i].equals("left")) {
                if(min_x == answer[0]) {
                    continue;
                } else {
                    answer[0] -= 1;
                }
            } else if(keyinput[i].equals("up")) {
                if(max_y == answer[1]) {
                    continue;
                } else {
                    answer[1] += 1;
                }
            } else if(keyinput[i].equals("down")) {
                if(min_y == answer[1]) {
                    continue;
                } else {
                    answer[1] -= 1;
                }
            }
            
        }   
        
        
        return answer;
    }
}