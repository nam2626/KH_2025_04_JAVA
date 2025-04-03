
public class E09_Final {
	/*
	 * 	상수 : 한번 저장한 값을 바꾸지 못하게 하는 변수
	 * 
	 * 	상수명 지을 때 규칙 : Snake Case
	 * 		1. 상수명은 모두 대문자로 구성
	 * 		2. 합성어일 경우 각 단어들 사이에 _로 연결
	 * 			예> 로또번호 최대값 ---> LOTTO_MAX_NUMBER
	 * 				최대 학생 인원수 ---> STUDENT_MAX_COUNT
	 * 
	 */
	public static void main(String[] args) {
		final double PI = 3.1415;
//		PI = 4.1415; //상수는 변경이 안됨
		System.out.println(4 * 4 * PI);
		System.out.println(4 * 4 * Math.PI);
		
		final int A;
		A = 100; //초기화는 처음 한번만 가능
//		A = 200; //두번째부터는 불가능
		System.out.println(A);

	}

}




