import java.util.Scanner;

public class E14_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;//합
		
		while(n > 0) {
			sum += n % 10; //자리수 더하는 부분
			n /= 10; // 자리수를 줄이는 부분
		}
		
		System.out.println("자리수의 합 : " + sum);
		
		
		
	}

}
