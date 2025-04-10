import java.util.Scanner;

public class E24_Review {

	public static void main(String[] args) {
		// 문제 1 - 1부터 N까지 홀수 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1)
				System.out.print(i + " ");
		}
		System.out.println();
		
		// 문제 2: for문 – 별 가로 출력
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println();
		
//		문제 3: `do-while` – 비밀번호 확인
//		비밀번호는 `4321`로 고정되어 있음.
//		맞게 입력할 때까지 계속 입력 받고, 맞으면 `"접속 성공"` 출력하세요.
		String passwd = null;
		do {
			System.out.print("비밀번호 입력 : ");
			passwd = sc.nextLine();
			if(!passwd.equals("4321"))
				System.out.println("잘못된 비밀번호를 입력하셨습니다.");
		}while(!passwd.equals("4321"));
		System.out.println("접속 성공");
		
//		문제 5: `do-while` – 입력값 누적합
//		0을 입력할 때까지 숫자를 계속 입력받고,
//		지금까지 입력한 수의 합계를 출력하세요.
		
		int sum = 0, num = 0;
		
		do {
			System.out.print("숫자 입력(0입력시 종료) : ");
			num = sc.nextInt();
			sum += num;			
		}while(num != 0);
		
		System.out.println("입력하신 숫자들의 총합 : " + sum);
		
	}

}




