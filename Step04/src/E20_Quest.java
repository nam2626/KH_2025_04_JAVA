import java.util.Scanner;

public class E20_Quest {
	/*
	 * 	정수 두개를 입력 받은 후에
	 * 	입력 받은 숫자의 작은 숫자부터 큰 숫자까지 합을 출력
	 * 	입력받는 숫자들의 순서는 없다.
	 * 
	 * 	실행 예시>
	 * 	숫자 입력 > 1
	 * 	숫자 입력 > 10
	 * 	1 ~ 10 까지 합 : 55
	 * -------------------------
	 * 	숫자 입력 > 100
	 * 	숫자 입력 > 1
	 * 	1 ~ 100 까지 합 : 5050
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		int sum = 0;
		/*
		if(n1 < n2) {
			for(int i=n1;i<=n2;i++) {
				sum += i;
			}
		}else {
			for(int i=n2;i<=n1;i++) {
				sum += i;
			}
		}
		*/

		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}		
		
		for(int i=n1;i<=n2;i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}














