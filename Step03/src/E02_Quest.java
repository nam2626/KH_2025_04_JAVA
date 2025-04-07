import java.util.Scanner;

public class E02_Quest {
	/*
	 * 	숫자 하나를 입력받아서
	 * 	해당 숫자가 짝수인지, 홀수인지, 0인지 구분해서 출력
	 * 
	 * 	실행예시>			실행예시>			실행예시>
	 * 	숫자입력 > 5		숫자입력 > 0		숫자입력 > 4		
	 * 	홀수입니다.		0입니다			짝수입니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
//		System.out.println("입력 받은 숫자 : " + n);

		if(n != 0 && n % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if(n % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		if(n == 0) {
			System.out.println("0입니다.");
		}
		
		
	}

}












