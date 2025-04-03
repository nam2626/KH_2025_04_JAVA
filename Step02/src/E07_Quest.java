import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수형 데이터 두개를 사용자로부터 입력 받은 후
		//입력 받은 두개의 데이터의 사칙연산의 결과를 출력

		//1. 숫자 입력, 두번
		//	정수형 변수 두개 선언 후 초기화
		int n1=0, n2=0;
		//	숫자 입력 두번 받음
		System.out.println("첫번째 숫자 입력 : " );
		n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : " );
		n2 = sc.nextInt();
		
//		System.out.println(n1 + " " + n2);
		
		//2. 계산
		//3. 결과 출력
		//	사칙연산 후 바로 결과 출력
		System.out.println("덧셈 결과 : " + (n1 + n2));
		System.out.println("뺄셈 결과 : " + (n1 - n2));
		System.out.println("곱셈 결과 : " + (n1 * n2));
		System.out.println("나눗셈 - 몫 결과 : " + (n1 / n2));
		System.out.println("나눗셈 - 나머지 결과 : " + (n1 % n2));
		
	}

}


