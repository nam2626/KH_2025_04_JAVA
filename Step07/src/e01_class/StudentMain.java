package e01_class;

public class StudentMain {

	public static void main(String[] args) {
		//학생 하나 만들고, 데이터 초기화
		Student std1 = new Student();
		std1.init("20001111", "홍길동", "컴퓨터공학과", 3.4);
		System.out.println(std1.getGrade());
		std1.setScore(4.2);
		System.out.println(std1.getGrade());
		std1.printStudentInfo();
		
		Student std2 = new Student();
		std2.init("20002222", "김철수", "게임학과", 4.5);
		std2.printStudentInfo();
	}

}
