package e02_constructor;

public class Student {
	//학번, 이름, 학과명, 평점 저장하는 필드 작성
	String studentNo;
	String studentName;
	String majorName;
	double score;

	//모든 필드를 초기화하는 생성자 작성
	Student(String sno, String sname, String mname, double s){
		studentNo = sno;
		studentName = sname;
		majorName = mname;
		score = s;		
	}
	
	//학생정보 출력하는 메서드
	void printStudentInfo() {
		System.out.println(studentNo + " " + studentName 
				+ " " + majorName + " " + score);
	}
}





