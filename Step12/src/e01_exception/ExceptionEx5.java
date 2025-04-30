package e01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {
	
	//static메서드
	//정수 두개 받아서 나눈 결과 몫만 리턴하는 메서드
	public static int div(int n1, int n2) 
			throws ArithmeticException {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		//숫자 두개 입력 받아서 나누기 메서드 실행
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();
			
			System.out.println(div(n1,n2));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}

}



