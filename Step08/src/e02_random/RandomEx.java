package e02_random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random r = new Random();

		System.out.println(r.nextInt());
		// x % 45
		System.out.println(r.nextInt(45));
		//로또 번호 범위
		System.out.println(r.nextInt(45) + 1);
		// 25~60 --> Math.random()로 하던 공식과 동일
		// nextInt(최대값 - 최소값 + 1) + 최소값
		System.out.println(r.nextInt(36) + 25);
		System.out.println(r.nextInt(1, 46));
		
		//seed 값이 같으면 실행 할떄마다 나오는 숫자가 동일하다.
		Random s = new Random(1);
		for(int i=0;i<5;i++) {
			System.out.println(s.nextInt());
		}
	}

}







