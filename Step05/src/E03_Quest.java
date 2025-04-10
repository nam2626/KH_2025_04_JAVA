
public class E03_Quest {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d * %d = %2d", dan, i, dan * i);
				if (dan < 9)
					System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
