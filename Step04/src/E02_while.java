
public class E02_while {

	public static void main(String[] args) {
		//숫자 1~100까지 출력
		int i = 1;
		//case 1
		while(i < 101) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		//case 2
		//초기값이 다름
		i = 0;
		
		while(i < 100) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		
		//case 3
		i = 0;
		while(i<100) System.out.print(++i + " ");
		System.out.println();

		//case 4
		i = 0;
		while(i++ < 100) System.out.print(i + " ");
		System.out.println();
	}

}




