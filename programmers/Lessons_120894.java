package programmers;

public class Lessons_120894 { // 영어가 싫어요
	public static void main(String[] args) {
		String[] n = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String numbers = "onetwothreefourfivesixseveneightnine";
		
		for(int i = 0; i < n.length; i++) {
			numbers = numbers.replaceAll(n[i], Integer.toString(i));
		}
		
		long answer = Long.parseLong(numbers);
		System.out.println(answer);
	}
}
