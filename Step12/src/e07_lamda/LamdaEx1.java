package e07_lamda;

public class LamdaEx1 {
	/*
	 * 	람다(Lamda)
	 * 		JDK8 버전부터 도입된 기능
	 * 		함수형 프로그래밍 스타일을 지원하는 방법으로
	 * 		익명함수의 한 형태로 메서드를 간단하게 표현할 수 있음
	 * 
	 * 		(매개변수) -> 실행할 코드 한줄; <-- 한줄 결과는 리턴
	 * 
	 * 		(매개변수) -> {
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 		}
	 */
	public static void main(String[] args) {
		//Calcurator를 익명 클래스로 만들어서
		//숫자 두개 덧셈하는 걸로 생성
		Calcurator sum = new Calcurator() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 20));
		
		Calcurator calc = (a,b) -> a + b;
		System.out.println(calc.calc(5, 6));
		//뺄셈
		Calcurator minus = (x, y) -> x - y;
		System.out.println(minus.calc(5, 6));
		//두숫자 중에 큰 숫자 리턴
		Calcurator max = (x, y) -> x > y ? x : y;
		System.out.println(max.calc(5, 6));
		
		Calcurator total = (x, y) -> {
			//x 부터 y까지 합 리턴
			int s = 0;
			
			for(int i=x;i<=y;i++)
				s += i;
			
			return s;
		};
		System.out.println(total.calc(1, 100));
		
		
	}

}






