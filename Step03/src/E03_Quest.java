import java.util.Scanner;

public class E03_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 > ");
		int age = sc.nextInt();
		
		//사용자로부터 나이를 입력 받아서
		//성인인지 미성년자인지, 잘못된 데이터 인지(나이 값이 0이하)를 파악후 출력
		if(age <= 0) {
			System.out.println("잘못된 데이터를 입력하셨습니다.");
		}
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		
		if(age > 0 && age < 20) {
			System.out.println("미성년자 입니다.");
		}
	}

}









