import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
		/* 
		 * 	양수 하나 입력을 받은 후에
		 * 	입력 숫자의 구구단을 출력
		 * 
		 * 	실행 예시>
		 * 		단 입력 > 4
		 * 		4 * 1 = 4
		 * 		4 * 2 = 8
		 * 		4 * 3 = 12
		 * 		...
		 * 		4 * 8 = 32
		 * 		4 * 9 = 36
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 > ");
		int dan = sc.nextInt();
		//곱하는 값 1~9
		int i = 1;
		
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " +dan * i);
			i++;
		}
		
	}

}










