import java.util.Scanner;

public class E18_Quest {
	/*
	 * 	숫자 하나를 입력 받아서
	 * 	입력한 숫자의 모든 약수를 출력
	 * 	(for문 작업)
	 * 	실행 예시>
	 * 	숫자 입력 : 6
	 * 	1 2 3 6
	 * 	-----------------
	 * 	숫자 입력 : 10
	 * 	1 2 5 10
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if(n % i == 0)
				System.out.print(i + " ");
		}
	}

}






