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
	/*
	 * 	Call by Reference - 참조에 의한 호출 --> 메모리 주소값을 복사해서 전달
	 * 		메모리 주소값을 전달하기 떄문에 다른 메서드에서 수정 작업을 하면 원본 내용이 바뀐다.
	 * 		전달 받은 메모리 주소에 원본값이 있기때문에 다른 메서드에서 동일한 데이터에 접근함.
	 * 		주로 참조형 변수타입에서 발생(클래스, ...)
	 */
	static void updateStudent(Student std) {
		std.updateScore(4.5);
	}
	public static void main(String[] args) {
		int n = 10;
		addNumber(n);
		System.out.println(n);

		Student std = new Student("1111","김철수","컴퓨터공학과",2.3);
		std.printStudentInfo();
		updateStudent(std);
		std.printStudentInfo();
		
	}

}





