import java.util.Scanner;

public class E25_PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		//입력한 숫자가 소수인지?
		//소수(Prime Number) : 숫자의 약수가 1과 자기자신만 있는 숫자
		//						2, 3, 5, 7, 11 ....
		boolean result = false;
		
		if(n < 2) result = true;
		
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				result = true;
				break;
			}
		}
		if(result)
			System.out.println("소수가 아닙니다.");
		else
			System.out.println("소수입니다.");
			
		
	}

}



