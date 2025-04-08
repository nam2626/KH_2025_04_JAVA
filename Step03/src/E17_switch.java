import java.util.Scanner;

public class E17_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("명령어를 입력하세요 : ");
		String command = sc.nextLine();
		//String command = new String("register");
		//스위치에서는 문자열을 내부 값을 기준으로 동일한지 비교
		switch(command) {
		case "register":
			System.out.println("회원 정보 등록 기능을 실행합니다.");
			break;
		case "delete":
			System.out.println("회원 정보 삭제 기능을 실행합니다.");
			break;
		case "search":
			System.out.println("회원정보 검색 기능을 실행합니다.");
			break;
		default:
			System.out.println("잘못된 명령어를 입력하셨습니다.");
		}
	}

}
