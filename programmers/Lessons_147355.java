package programmers;

public class Lessons_147355 {
	public static void main(String[] args) { // 147355번, 크기가 작은 부분 문자열
		String t = "500221";
		String p = "72244";
		
		int cnt = 0;
		Long p2 = Long.parseLong(p);
		
		for(int i = 0; i < t.length() - p.length() + 1; i++) {
			long num = Long.parseLong(t.substring(i, i + p.length()));
			if(num <= p2) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
