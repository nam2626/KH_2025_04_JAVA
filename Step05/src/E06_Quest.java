
public class E06_Quest {
	/*
	 * 	1~10까지 숫자의 약수 목록을 아래와 같은 형태로 출력
	 * 	1 - 1
	 * 	2 - 1 2
	 *  3 - 1 3
	 *  4 - 1 2 4
	 *  5 - 1 5
	 *  6 - 1 2 3 6
	 *  7 - 1 7
	 *  8 - 1 2 4
	 *  9 - 1 3 9
	 *  10 - 1 2 5 10
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " - ");
			//약수 목록만 추가로 출력
			for(int j = 1; j <= i; j++) {
				if(i % j == 0)
					System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

}







