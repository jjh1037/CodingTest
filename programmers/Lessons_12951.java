package programmers;

public class Lessons_12951 {
	public static void main(String[] args) { // 12951번 , JadenCase 문자열 만들기
		String s = "3people unFollowed me";
		
		String[] arr = s.split("");
		
		arr[0] = arr[0].toUpperCase();
		
		for(int i = 1; i < arr.length; i++) {
			
			arr[i] = arr[i].toLowerCase();
			
			if(arr[i - 1].equals(" ")) {
				arr[i] = arr[i].toUpperCase();
			}
		}
		
		String answer = "";
		for(String a : arr) {
			answer += a;
		}
		
		System.out.println(answer);
	}
}
