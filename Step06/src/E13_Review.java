import java.util.Scanner;

public class E13_Review {
	//길이 5인 정수 배열에 숫자를 입력받고, 전체 평균을 소수점 없이 출력하시오.
	public static void main(String[] args) {
		//1. 배열 생성, Scanner 생성
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		
		//2. 배열에 숫자를 입력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자 입력 : ");
			numbers[i] = sc.nextInt();
		}
		//3. 배열에 저장된 숫자들의 총합을 구함
		int sum = 0;
		
		for(int n : numbers) {
			sum += n;
		}
		//4. 구한 총합으로 평균 출력 
		System.out.println("평균 : " + sum / numbers.length ) ;
	}

}
