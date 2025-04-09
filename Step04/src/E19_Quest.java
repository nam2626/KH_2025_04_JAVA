import java.util.Scanner;

public class E19_Quest {
	/*
	 * 	숫자 하나를 입력 받은 후에
	 * 	입력한 숫자가 완전수 인지 아닌지 출력
	 * 
	 * 	완전수 : 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 경우
	 * 
	 * 	6이 완전수 임 : 1, 2, 3
	 * 	
	 * 	실행 예시>
	 * 	숫자 입력 : 6
	 * 	완전수 입니다.
	 * 	---------------
	 * 	숫자 입력 : 
	 * 	완전수가 아닙니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= n / 2 ; i++) {
			if(n % i == 0) {
				sum += i; //약수의 합을 구하는 부분
//				System.out.println(i);
			}
		}
		
		if(n == sum)
			System.out.println("완전수 입니다.");
		else
			System.out.println("완전수가 아닙니다.");
			
	}

}








