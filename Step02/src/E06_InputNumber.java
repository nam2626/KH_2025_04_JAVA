import java.util.Scanner;

public class E06_InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		System.out.println("숫자 입력 : ");
		n1 = sc.nextInt(); //실제 숫자를 입력 받고 난 뒤에 n1에 저장
		System.out.println("n1 : " + n1);
		
		int n2 = 0;
		System.out.println("숫자 입력 : ");
		n2 = sc.nextInt();
		System.out.println("n2 : " + n2);
		
		//실수 하나 입력 받아서 출력
		double d1 = 0;
		System.out.println("실수 입력 : ");
		d1 = sc.nextDouble();
		System.out.println("d1 : " + d1);
		
		System.out.println("숫자 입력 : ");
		int n3 = sc.nextInt(16);
		System.out.println("n3 : " + n3);
		
		
	}

}





