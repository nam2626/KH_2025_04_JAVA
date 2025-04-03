
public class E03_VariableType {
	/*
	 * 	변수 타입
	 * 		정수형 : byte(1), short(2), int(4), long(8)
	 * 		실수형 : float(4), double(8)
	 * 		문자형 : char(2)
	 * 		논리형 : boolean(1)
	 * 
	 * 	변수명 짓는 규칙
	 * 		1. 알파벳(대소문자 구분), 숫자, 특수문자 -> _ $
	 * 		2. 키워드와 동일하면 안됨
	 * 		3. 첫글자로 숫자는 올 수 없음
	 * 		4. 중복된 변수명을 쓸 수 없음
	 * 
	 * 	변수명 네이밍 규칙
	 * 		Camel Case(카멜 표기법) : 변수명, 메서드명
	 * 								첫글자는 소문자로 시작
	 * 								합성어 일때 두번째 단어부터 첫글자는 대문자
	 * 		Snake Case(스네이크 표기법) : 상수명
	 * 								   단어와 단어 사이를 _ 로 구분
	 * 								   이름이 전부 소문자이거나, 대문자 일때 사용
	 * 		Pascal Case(파스칼 표기법) : 클래스명, 인터페이스명
	 * 								   첫글자는 대문자로 시작
	 * 								   합성어 일때 두번째 단어부터 첫글자는 대문자
	 */
	public static void main(String[] args) {

		int i = 2147483647;
		System.out.println(i);
		
		long l = 9223372036854775807L;
		System.out.println(l);
		
		byte b = 126;
		System.out.println(b);
		
		b++;
		System.out.println(b);
		
		double d = 3.1415;
		System.out.println(d);
		
		float f = 3.1415F;
		System.out.println(f);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = '가';
		System.out.println(ch2);
		
		int i1 = ch1;
		System.out.println(i1);
		
		int i2 = ch2;
		System.out.println(i2);
		
		boolean flag = true;
		System.out.println(flag);
		
		flag = false;
		System.out.println(flag);
		
	}

}











