import java.util.Scanner;

public class E10_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 처리
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		case 1, 2, 12:
			System.out.println("겨울");
			break;			
		}
		
		
	}

}
