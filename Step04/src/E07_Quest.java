import java.util.Scanner;

public class E07_Quest {
	/*
	 * 	양수 하나를 입력 받아서
	 * 	1부터 입력한 숫자한 숫자까지의 합을 출력
	 * 	
	 * 	숫자 : 10
	 * 	1~10까지 합 : 55
	 * 
	 * 	숫자 : 100
	 * 	1~100까지 합 : 5050
	 * 
	 * 반복문 전후로 해야될 일을 체크
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1, total = 0;
		
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		while(i <= num) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
