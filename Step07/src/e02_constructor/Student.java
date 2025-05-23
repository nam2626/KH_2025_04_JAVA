package e02_constructor;

public class Student {
	//학번, 이름, 학과명, 평점 저장하는 필드 작성
	String studentNo;
	String studentName;
	String majorName;
	double score;

	//모든 필드를 초기화하는 생성자 작성
//	Student(String sno, String sname, String mname, double s){
//		studentNo = sno;
//		studentName = sname;
//		majorName = mname;
//		score = s;		
//	}
	
	//기본생성자
	public Student() {
		//this() --> 다른 생성자를 호출
		this("00000000","홍길동","학과명샘플",2.4);
	}
	
	
	public Student(String studentNo, String studentName, String majorName, double score) {
		//this => 자기 자신 객체를 나타내는 키워드
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}
	
	public void updateScore(double score) {
		this.score = score;
	}


	//학생정보 출력하는 메서드
	public void printStudentInfo() {
		System.out.println(studentNo + " " + studentName 
				+ " " + majorName + " " + score);
	}

}





