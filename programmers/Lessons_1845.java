package programmers;

import java.util.HashSet;
import java.util.Set;

public class Lessons_1845 {
	public static void main(String[] args) { // 폰켓몬, 1845번
		int[] nums = {3,3,3,2,2,4};
		int a = 0;
		int n = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        } 
		
        if(set.size() > n) {
            System.out.println(n);
        }else {
        	System.out.println(set.size());
        }
		
	}
}
