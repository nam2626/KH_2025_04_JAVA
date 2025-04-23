package e05_has_a;

public class StudentMain {

	public static void main(String[] args) {
		//학생 클래스 생성
		Student s = new Student("20001111", "홍길동", "컴퓨터공학과");
		//과목 3~4개 등록
		s.addSubject(new Subject("자바 프로그래밍", 86));
		s.addSubject(new Subject("자료구조", 92));
		s.addSubject(new Subject("컴퓨터 구조", 78));
		s.addSubject(new Subject("데이터베이스 개론", 95));
		
		System.out.println(s);
		
	}

}
