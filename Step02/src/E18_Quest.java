import java.util.Scanner;

public class E18_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int n2 = sc.nextInt();
		
		//입력된 두 숫자 중에 큰 숫자만 출력
		int max = n1 > n2 ?  n1 : n2;
		System.out.println("큰 숫자 : " + max);
//		System.out.println("큰 숫자 : " + (n1 > n2 ?  n1 : n2));
	}

}
