import java.util.Scanner;

public class E17_ThreeOperator {
	/*
	 * 	삼항 연산자
	 * 		조건식이 true/false 일때 실행할 연산을 구분해주는 연산자
	 * 
	 * 		조건식 ? 참일 때 실행할 연산 : 거짓일 때 실행할 연산;
	 */
		
	public static void main(String[] args) {
		int n = 5;
		
		String result = n % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		//-----------------------------------------------
		Scanner sc = new Scanner(System.in);
		//나이를 입력 받은 후에
		//20살 이상이면 '성인' 출력, 그 외에는 '미성년자' 출력
		
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		result = age >= 20 ? "성인" : "미성년자";
		System.out.println(result);
		System.out.println(age >= 20 ? "성인" : "미성년자");
		
	}

}



