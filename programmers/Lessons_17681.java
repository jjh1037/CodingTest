package programmers;

public class Lessons_17681 {

	public static void main(String[] args) { // [1차] 비밀지도
	int n = 5;
	int[] arr1 = {9, 20, 28, 18, 11};
	int[] arr2 = {30, 1, 21, 17, 28};
	String[] answer = new String[n];
	        
    for(int i = 0; i < n; i++) { // 반복문
        answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 10진수 이진수 게산 후 String
        answer[i] = String.format("%"+n+"s", answer[i]);
        answer[i] = answer[i].replace("1", "#");
        answer[i] = answer[i].replace("0", " ");
        // 자리수 String.format
        //repeat
	}
			
		
	}

}
