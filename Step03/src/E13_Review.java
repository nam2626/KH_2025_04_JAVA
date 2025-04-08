import java.util.Scanner;

public class E13_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		if(id.equals("admin"))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
	}

}
