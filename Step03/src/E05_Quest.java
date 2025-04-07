import java.util.Scanner;

public class E05_Quest {
	/*
	 * 	사용자로부터 나이를 입력 받아서
	 * 	입력 받은 나이가 20세 이상이면 성인이라고 출력
	 * 	입력 받은 나이가 20세 미만이면 미성년자라고 출력
	 * 	단 0세 이하의 잘못된 데이터는 무시
	 * 	if-else 이용
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 > ");
		int age = sc.nextInt();
		
		if(age < 20) {
			System.out.println("미성년자 입니다.");
		}else {
			System.out.println("성인 입니다.");
		}
		
	}

}






