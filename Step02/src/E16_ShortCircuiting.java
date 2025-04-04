
public class E16_ShortCircuiting {
	/*
	 * 	단락 회로
	 * 		논리 연산자로 조건식 비교시 앞전 비교연산에서 true나 false가 확정되면
	 * 		뒤에있는 비교연산이 생략된다.
	 * 
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 7;
		
		System.out.println(n1 > 5 || ++n2 > 10);
		System.out.println(n2);
		System.out.println(n1 < 5 && ++n2 > 10);
		System.out.println(n2);
	}

}
