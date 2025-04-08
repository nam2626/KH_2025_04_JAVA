import java.util.Scanner;

public class E03_Quest {
	/*
	 * 	양수 하나를 입력은 받은 후에
	 * 	입력받은 숫자 만큼 Hello World를 출력
	 * 	
	 * 	실행 예시>
	 * 		숫자 입력 > 6
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		int i = 0;
		
		while(i < num) {
			System.out.println("Hello World");
			i++;
		}
		
		System.out.println("------");
		
		while(num-- > 0) 
			System.out.println("Hello World");
		
		
	}

}














