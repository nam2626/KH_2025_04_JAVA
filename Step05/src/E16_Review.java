import java.util.Scanner;

public class E16_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
