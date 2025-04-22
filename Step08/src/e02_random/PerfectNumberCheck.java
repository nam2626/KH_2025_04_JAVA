package e02_random;

import java.util.Random;

public class PerfectNumberCheck {
	
	public static int randNumber() {
		return (new Random()).nextInt(1, 1001);
	}
	
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		
		for(int i=1;i<num;i++) {
			if(num % i == 0)
				sum += i;
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		int n = randNumber();
		if(isPerfectNumber(n))
			System.out.println(n + "은 완전수 입니다.");
		else
			System.out.println(n + "은 완전수가 아닙니다.");
	}

}




