class Solution {
    public String solution(String polynomial) { // 다항식 더하기
        String answer = "";
        int xNum = 0;
		int yNum = 0;
        String[] array = polynomial.split(" +");
        for(int i = 0; i <= array.length; i+=2) {
			if(array[i].contains("x")) {
				if(array[i].equals("x")) {
					xNum += 1;
				}else {
					xNum += Integer.parseInt(array[i].replace("x", ""));	
				}
			}else {
				yNum += Integer.parseInt(array[i]);
			}
		}
		
		if(xNum == 0) {
			
		}else if(xNum == 1) {
            answer += "x";  
        }else {
			answer += xNum + "x";
		}
		
		if(yNum == 0) {
			
		}else {
            if(xNum == 0) {
                answer += yNum;
            }else {
                answer += " + " + yNum;    
            }
		}
        return answer;
    }
}
