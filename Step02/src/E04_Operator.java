
public class E04_Operator {
	/*
	 * 		사칙연산
	 * 			덧셈		+
	 * 			뺄셈		-
	 * 			곱셈		*
	 * 			나눗셈	/  <-- 몫
	 * 			나눗셈	%  <-- 나머지
	 * 
	 */
	public static void main(String[] args) {
		//정수형 변수 두개 선언하여, 원하는 값으로 초기화
		int n1 = 10, n2 = 3;
		
		System.out.println(n1 + n2);
		//뺄셈, 곱셈, 나눗셈 결과도 출력
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
		//실수형 변수 두개 선언해서 초기화 후 사칙연산 결과 출력
		double d1 = 10.2, d2 = 3.3;
		
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		System.out.println(d1 % d2);
		
		System.out.println('A' + 1);
		
	}

}








