import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int n2 = sc.nextInt();
		
		//두 숫자의 뺄셈 결과가 무조건 양수가 나오게끔 처리
		//case - 1
		//큰숫자에 작은 숫자 뺴기
		if(n1 > n2) {
			System.out.println(n1 - n2);
		}else {
			System.out.println(n2 - n1);
		}
		
		//case - 2
		//n1이 크면 n2와 교환 후 n1 - n2
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println(n2 - n1);
		
		//case - 3
		//일단 빼기 먼저 처리 후 결과가 음수면 부호 변경
		int result = n1 - n2;
		
		if(result < 0)
			result = -result;
		
		System.out.println(result);
	}

}
















