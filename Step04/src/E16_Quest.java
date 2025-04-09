import java.util.Scanner;

public class E16_Quest {
	/*
	 * 숫자 하나 입력 받은 후에
	 * 입력한 숫자의 팩토리얼 값을 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		int fac = 1;
		
		for(int i = 1;i <= n;i++) {
			fac *= i;
		}
		
		System.out.println(n + "! : " + fac);
	}

}









