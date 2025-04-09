import java.util.Scanner;

public class E07_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 처리
		System.out.print("입력 > ");
		String str = sc.nextLine();
		
		switch (str) {
		case "apple":
			System.out.println("사과는 빨간색 입니다.");
			break;
		case "banana":
			System.out.println("바나나는 노란색 입니다.");
			break;
		case "grape":
			System.out.println("포도는 보라색 입니다.");
			break;
		default:
			System.out.println("알 수 없는 과일입니다.");
		}
	}

}
