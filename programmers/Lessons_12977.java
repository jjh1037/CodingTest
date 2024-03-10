package programmers;

public class Lessons_12977 {
	public static void main(String[] args) { // 소수 만들기
		int[] nums = {1,2,3,4};
		int sum = 0;
		int answer = 0;
		
		
		for(int i = 0; i < nums.length ; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					boolean flag = false;
					sum = nums[i] + nums[j] + nums[k];
					for(int m = 2; m < sum; m++) {
						if(sum % m == 0) {
							flag = true;
							break;
						}
					}
					
					if(!flag) answer++;
					
					
				}
			}
		}
		
		System.out.println(answer);
		
		
		
		
		
		
	}
}
