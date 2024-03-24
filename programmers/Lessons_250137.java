package programmers;

public class Lessons_250137 {
	public static void main(String[] args) { // 250137번, 붕대 감기
		int answer = 0;
		int[] bandage = {5, 1, 5};
		int health = 30;
		int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
		
		int maxHP = health;
		int attackCount = 0;
		int stack = 0;
		for(int i = 1; i <= attacks[attacks.length - 1][0]; i++  ) {
			
			// 몬스터 공격
			if(attacks[attackCount][0] == i) {
				health -= attacks[attackCount][1];
				attackCount++;
				stack = 0;
				if(health <= 0) {
					answer = -1;
					System.out.println("시간 : " + i);
					System.out.println("체력 : " + health);
					System.out.println("게임오버");
					break;
				}
				System.out.println("시간 : " + i);
				System.out.println("체력 : " + health);
				System.out.println("연속성공 : " + stack);
				System.out.println("=====================");
				continue;
			}
			
			// 회복
			health += bandage[1];
			stack++;
			if(stack == bandage[0]) {
				health += bandage[2];
				stack = 0;
			}
			
			if(health >= maxHP) {
				health =maxHP;
			}

			System.out.println("시간 : " + i);
			System.out.println("체력 : " + health);
			System.out.println("연속성공 : " + stack);
			System.out.println("=====================");
			
			if(health <= 0) answer = -1;
	        else answer = health;
		}
	}
}
