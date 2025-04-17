package e02_constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("20001111", "홍길동", "컴퓨터 공학과", 4.2);
		std1.printStudentInfo();
		
		//생성자를 사용자가 만들면, 기본 생성자는 자동으로 추가되지 않음
		//Student std2 = new Student();
	}

}
