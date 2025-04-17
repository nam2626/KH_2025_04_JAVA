package e03_method;

public class E02_MethodOverloading {
	/*
	 * 	메서드 오버로딩
	 * 		메서드 이름을 중복으로 사용이 가능하게끔 하는 문법
	 * 		이름이 같으면 구분해서 호출하는게 불가능하므로
	 * 		인자값을 받을 매개변수에 차이점을 둬서 구분
	 * 		
	 * 		1. 매개변수 개수가 같다면, 매개변수 타입이 서로 일치하지 않으면 됨
	 * 		2. 매개변수 개수가 서로 다르면 됨
	 * 	
	 */
	static int sum(int a, int...arr) {
		System.out.println("sum(int,int...arr)");
		int s = 0;
		for(int i = 0;i<arr.length;i++)
			s += arr[i];
		return s;
	}
	static int sum(int...arr) {
		System.out.println("sum(int...arr)");
		int s = 0;
		for(int i = 0;i<arr.length;i++)
			s += arr[i];
		return s;
	}
	static int sum(int a, int b, int c) {
		System.out.println("sum(int,int,int)");
		return a + b + c;
	}
	static int sum(short a, int b) {
		System.out.println("sum(short,int)");
		return a + b;
	}
	static int sum(int a, short b) {
		System.out.println("sum(int, short)");
		return a + b;
	}
	
	//int형 값 두개 받아서 합을 리턴하는 메서드
	static int sum(int a, int b) {
		System.out.println("sum(int, int)");
		return a + b;
	}
	//short형 값 두개 받아서 합을 리턴하는 메서드
	static short sum(short a, short b) {
		System.out.println("sum(short, short)");
		return (short)(a + b);
	}
	//double형 값 두개 받아서 합을 리턴하는 메서드
	static double sum(double a, double b) {
		System.out.println("sum(double, double)");
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		//sum(int a, int...arr), sum(int...arr) 호출하는 형태가 겹쳐서 사용하는 쪽에서 오류
//		System.out.println(sum(10, 20, 30, 40));
		System.out.println(sum((short)5, (short)6));
		System.out.println(sum(2.14, 4.21));
	}

}



