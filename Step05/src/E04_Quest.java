import java.util.Scanner;

public class E04_Quest {
	/*
	 * 		숫자 입력 > 5		숫자 입력 > 7
	 * 			
	 * 		*				*
	 * 		**				**
	 * 		***				***
	 * 		****			****
	 * 		*****			*****
	 * 			 			******
	 * 						*******
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int ea = sc.nextInt();
		
		for(int i = 0; i < ea; i++) {
			for(int j = 0;j < i + 1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}








