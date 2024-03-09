package programmers;

import java.util.Scanner;

public class Lessons_12901 {
	public static void main(String[] args) { // 2016년, 12901번
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dateStr = {"THU","FRI", "SAT","SUN","MON","TUE","WED"};
		int date = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("일을 입력하시오 : ");
		int b = sc.nextInt();
		
		for(int i = 0; i < a - 1; i++) {
			date += month[i];
		}
		date += b;
		
		 
		
		System.out.println(dateStr[date % 7]);
		
	}
}
