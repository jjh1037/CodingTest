package programmers;

class Solution {
    public int solution(int chicken) { // 치킨 쿠폰
        int answer = 0;
		int coupon = chicken;
		while(coupon >= 10) {
			answer += coupon / 10;
			coupon = coupon / 10 + coupon % 10;
		}
        return answer;
    }
}
