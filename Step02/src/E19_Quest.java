import java.util.Scanner;

public class E19_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int n2 = sc.nextInt();
		
		//숫자 두개를 입력 받은 후, 
		//두 숫자의 뺄셈 결과가 반드시 양수가 나오게끔 처리해서 출력
		//case 1
		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		System.out.println("뺄셈 결과 : " + result);
		//case 2
		result = n1 - n2 > 0 ? n1 - n2 : (n1 - n2) * -1;
		System.out.println("뺄셈 결과 : " + result);
		//case 3
		result = n1 - n2;
		result = result < 0 ? -result : result;
		System.out.println("뺄셈 결과 : " + result);
		
	}

}




