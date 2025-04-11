import java.util.Scanner;

public class E15_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		while(n > 0) {
			System.out.print(n % 10);//마지막 자리수 출력
			n /= 10; // 자리수를 줄이는 부분
		}
		
	}

}
