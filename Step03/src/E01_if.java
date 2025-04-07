
public class E01_if {
	/*
	 * 	if문
	 * 		조건식이 true면 if문에 붙어있는 { 실행영역 }에 있는 코드를 실행
	 * 		조건식이 false면 해당 if문을 건너뜀
	 * 
	 *  조건식 : 관계연산자와 논리연산자를 이용한 수식, 결과는 true/false로 나옴
	 *  
	 *  if문의 구성요소는 if, else if, else가 있음	
	 * 
	 * 	if(조건식){
	 * 		실행할 코드...
	 * 		실행할 코드...
	 * 		실행할 코드...
	 * 	}
	 * 
	 */
	public static void main(String[] args) {
		int n = 0;
		
		if(n > 0) {
			System.out.println("양수입니다.");
		}
		
		if(n < 0) {
			System.out.println("음수입니다.");
		}
		
		//n이 0이면 0입니다. 출력하는 if문 추가
		//{}가 없으면 첫번째 ; 까지가 실행할 영역으로 잡음
		if(n == 0)
			System.out.println("0입니다.");
		
		System.out.println("프로그램 종료");
	}

}



