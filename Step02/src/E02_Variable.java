
public class E02_Variable {
	/*
	 * 	데이터 형태
	 * 		정수 : 양수, 음수, 0
	 * 		실수 : 정수에서 소수점이 추가된 형태
	 * 		문자 : 한 글자
	 * 		문자열 : 문자가 한개 이상 구성된 형태
	 * 		논리 : 참(True), 거짓(False)
	 *  
	 * 	변수(Variable) : 데이터를 하나 저장할 공간
	 * 
	 * 	변수 선언 방법
	 * 		변수타입 변수명
	 */
	public static void main(String[] args) {
		//변수 선언 방법 - 1
		int num;//num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
		num = 100; // 정수 100을 변수 num에 저장하겠다.
		System.out.println(num);//num이 저장하고 있는 100을 읽어와서 화면에 출력
		num = 200;
		num = num + 300;//num에 저장된 값 200과 300을 더한 결과를 다시 num에 저장
		System.out.println(num);
		
		//변수 선언 방법 - 2
		//초기화(initialize) : 변수를 선언한 뒤에 처음 저장하는 행위
		int n = 10;
		System.out.println(n);
		
		//변수 두개 선언 30, 40으로 초기화
		//동일한 변수타입의 변수를 여러개 선언하는 경우
		int a = 30, b = 40;
		System.out.println(a + " " + b);
		
		//정수를 저장할 변수 3개를 선언해서 전부 0으로 초기화 후에 출력
//		int c = 0, d = 0, e = 0;
		int c,d,e;
		c = d = e = 0;
		System.out.println(c + " " + d + " " + e);
	}

}







