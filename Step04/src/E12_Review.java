import java.util.Scanner;

public class E12_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 처리
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		//입력 받은 숫자의 자리수를 출력
		int i = 10, count = 1;
		
		while(num / i != 0) {
			count++;
			i *= 10;
		}
		
		System.out.println("자리수 : " + count);
		
		i = 10;
		count = 1;
		
		while(num % i != num) {
			count++;
			i *= 10;
		}
		
		System.out.println("자리수 : " + count);
		
	}

}






