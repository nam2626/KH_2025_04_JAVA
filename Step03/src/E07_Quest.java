import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int n2 = sc.nextInt();

		// 두 숫자 중에 큰숫자, 작은 숫자 구분해서 출력
		// 큰 숫자 : ?, 작은 숫자 : ?
		
		//case-1
		if (n1 > n2) {
			System.out.println("큰 숫자 : " + n1 + ", 작은 숫자 : " + n2);
		} else {
			System.out.println("큰 숫자 : " + n2 + ", 작은 숫자 : " + n1);
		}
		
		//case-2
		//if 키워드 한개만 이용, 추가적인 변수 선언이 필요
		//변수선언
		if(n1 < n2) {
			int temp = 0;
			//n1과 n2를 바꾸겠다.
			//1
			temp = n2;
			//2
			n2 = n1;
			//3
			n1 = temp;
		}
		
		System.out.println("큰 숫자 : " + n1 + ", 작은 숫자 : " + n2);
		
		
	}

}









