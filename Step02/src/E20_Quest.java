import java.util.Scanner;

public class E20_Quest {

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
		//입력 받은 문자가 알파벳이 아니면 아무런 작업을 하지 않아도 됨
		
		//case 1
		ch = ch >= 65 && ch <= 90 ? (char)(ch + 32) : (char)(ch - 32); 
		ch = (char)(ch >= 65 && ch <= 90 ? ch + 32 : ch - 32); 
		
		//case 2
		ch = (char)(ch > 'Z' ? ch - 32 : ch + 32); 
		ch = (char)(ch < 'a' ? ch + 32 : ch - 32); 
		
		System.out.println(ch);
	}

}




