
public class E14_Operator {
	/*
	 * 		관계 연산자 --> 조건식
	 * 					  결과는 true와 false로 나옵니다.
	 * 
	 * 		>	<	==	>=	<=	!=
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 후 초기화
		
		int n1 = 10, n2 = 7;
		
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println("-------");
		
		double d1 = 0.1, d2 = 0.2;
		System.out.println(d1 + d2 == 0.3);
		System.out.println(d1 + d2);
		
		boolean flag = n1 == n2;
		System.out.println(flag);
		
		flag = n1 + 1 == n2 % 3;
		System.out.println(flag);

		flag = (++n1 + 1) * 3 == n2 % (3 + 1);
		System.out.println(flag);
		
		
	}

}




