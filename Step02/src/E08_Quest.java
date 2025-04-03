import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//반지름 데이터 한개를 입력 받아서
		//입력 받은 반지름에 해당하는 원넓이를 출력 -> PI : 3.1415
		
		//1. 반지름 입력
		//	  반지름 저장할 정수형 변수 선언, 입력
		System.out.println("반지름 입력 : ");
		double r = sc.nextDouble();
		//2. 원넓이 계산해서 출력
		double area =  r*r*3.1415;
		System.out.println("원넓이 : " + area);
		
		
	}

}
