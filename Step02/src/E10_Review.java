import java.util.Scanner;

public class E10_Review {
	//출력, 변수, 입력, 사칙연산, 형변환, 상수
	public static void main(String[] args) {
		//출력문
		System.out.println("출력문");
		
		//변수 : int long float double char boolean
		int num = 0;
		
		//입력
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();//sc.nextInt() 입력 받은 숫자를 num에 저장됨
		
		System.out.println(num + 10);

		//사칙연산 : + - * / %
		System.out.println(num + 1);
		System.out.println(num - 3);
		System.out.println(num * 4);
		System.out.println(num / 2);
		System.out.println(num % 6);
		
		int result = num + 1;
		System.out.println(result);
		
		//형변환
		long l2 = 2342342344L;
		int i1 = (int) l2;
		System.out.println(i1);
		System.out.println((long)i1);
		
		double r = (double) 5 / 3;
		System.out.println(r);
		
	}	

}


