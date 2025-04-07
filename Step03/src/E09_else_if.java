
public class E09_else_if {
	/*
	 * 		else if
	 * 			if문으로 구성된 조건문에서 두번째 조건문부터 담당하는 문법
	 * 
	 * 		if(첫번쨰 조건식){
	 * 			실행할 코드...
	 * 		}else if(두번째 조건식){
	 * 			실행할 코드...
	 * 		}else if(세번째 조건식){
	 * 			실행할 코드...
	 * 		}else{
	 * 			실행할 코드...
	 * 		}
	 */
	public static void main(String[] args) {
		int n = 10;
		
		if(n > 0) {
			System.out.println("양수 입니다.");
		}else if(n == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수 입니다.");
		}
	}

}





