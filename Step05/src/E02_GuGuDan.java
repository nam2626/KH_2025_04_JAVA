
public class E02_GuGuDan {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(" -- " + dan + "단 -- ");
			//1~9까지 곱한 결과 출력 --> 2 * 1 = 2
			for(int i = 1; i < 10 ;i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}

}
