
public class E13_for {
	/*
	 * 		for(초기화 ; 조건식 ; 증감식){
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 		}
	 */
	public static void main(String[] args) {
		int i = 0;
		
		for(i = 0;i < 5;i++) {
			System.out.println("Hello World");
		}
		System.out.println(i);
		//-----------------
		for(int j=0;j < 5;j++) {
			System.out.println("Hello World - " + j);
		}
		//j는 for문에서 사용하기 위해 선언을 한 변수이기 때문에 for문이 끝나면 사라짐
		//			---> 지역 변수(Local Variable)
		//	지역변수는 {} 내에서 선언한 변수는 해당 {}가 끝나면 바로 사라짐 
		//System.out.println(j);
		
	}

}












