package programmers;

public class Lessons_120904 { // 숫자 찾기
	public static void main(String[] args) {
		int num = 232443;
		int k = 14;
		boolean isTrue = false;
		String number = Integer.toString(num);
		int[] arr= new int[number.length()];
		for(int i = 0; i < number.length(); i++) {
			arr[i] = (int)number.charAt(i) - '0';
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == k) {
				System.out.println(i + 1);
				isTrue = true;
				break;
			}
		}
		
		if(!isTrue) {
			System.out.println(-1);
		}
		

	}
}
