import java.util.Scanner;

public class E11_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);

		//입력받은 알파벳이 소문자면 대문자로 변환해서 출력
		//입력받은 알파벳이 대문자면 소문자로 변환해서 출력
		//	A -> 65,	a -> 97 
		//	B -> 66,	b -> 98
		//	...
		//	Z -> 90		z -> 122
		//입력 받은 문자가 알파벳이 아니면 "알파벳이 아닙니다." 메세지 출력
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println((char)(ch + 32));
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println((char)(ch - 32));
		}else {
			System.out.println("알파벳이 아닙니다.");
		}
		
	}

}


