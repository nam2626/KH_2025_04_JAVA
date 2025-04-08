import java.util.Scanner;

public class E08_Quest {
	/*
	 * 		숫자 하나 입력은 받은 후
	 * 		입력한 해당 숫자의 팩토리얼 값을 출력
	 * 
	 * 		예> 
	 * 		숫자 입력 > 5
	 * 		120
	 * 
	 * 		팩토리얼 : 한 숫자의 1부터 자기 자신까지의 숫자를 곱한 결과
	 * 		5 -> 1 * 2 * 3 * 4 * 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 처리
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		int fac = 1, i = 1;
		
		while(i <= num) {
			fac *= i;
			i++;
		}
		
		System.out.println(fac);
	}

}




