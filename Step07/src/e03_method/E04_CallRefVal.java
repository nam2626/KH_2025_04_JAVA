package e03_method;

import e02_constructor.Student;

public class E04_CallRefVal {
	/*
	 * 		Call by Value --> 값에 의한 호출 --> 값을 복사해서 보냄
	 * 				매개변수와 호출하는 변수와는 별개,
	 * 				메서드에서 매개변수의 데이터를 변경해도, 원본에는 영향을 미치지 않음.
	 * 				주로 기본형 변수 타입에서 발생함.(int, float, double, char, long....)
	 */
	static int addNumber(int n) {
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		int n = 10;
		addNumber(n);
		System.out.println(n);

		Student std = new Student("1111","김철수","컴퓨터공학과",2.3);
		
	}

}





