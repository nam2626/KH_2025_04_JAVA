package e03_method;

public class E03_RecursiveMethod {
	/*
	 * 재귀 호출
	 * 		메서드가 자기 자신 또 호출하는 방식
	 * 		반드시 자기 자신을 호출 안하는 경우를 넣어야함.
	 * 		안넣으면 너무 많은 스택메모리를 사용하기 떄문에
	 * 		메모리 오버플로우 현상으로 프로그램이 강제 종료 될 수 있음.
	 */
	static void printNum(int n) {
		System.out.println(n);
		if(n < 100)
			printNum(n+1);
		System.out.println(n + " 종료");
	}
	public static void main(String[] args) {
		printNum(1);
		System.out.println("5! : " + fac(5));
		System.out.println("2의 10승 : " + pow(10));
	}
	//숫자하나를 받아서 해당 숫자의 팩토리얼 결과값을 계산해서 리턴하는 메서드
//	static int fac(int n) {
//		int f = 1;
//		for(int i=1;i<=5;i++) {
//			f *= i;
//		}
//		return f;
//	}
	//return 5 * {return 4 * {return 3 * {return 2 * fac(1)}}}
	static int fac(int n) {
		if(n == 1)
			return 1;
		return n * fac(n-1);
	}
	//매개변수로 숫자 하나를 받아서 숫자에 해당하는 2의 n승 값을 리턴하는 메서드
	static int pow(int n) {
		if(n == 0)
			return 1;
		return 2 * pow(n-1);
	}
	
}



