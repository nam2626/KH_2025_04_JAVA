package e01_class;

public class Student {
	String studentNo;
	String studentName;
	String majorName;
	double score;
	
	//리턴 타입 : O , 매개변수 : O 
	boolean init(String no, String name, String major, double s) {
		studentNo = no;
		studentName = name;
		majorName = major;
		
		boolean flag = true;
		if(s >= 0 && s <= 4.5)
			score = s;
		else
			flag = false;
		return flag ;//결과값을 되돌려주는 부분
	}
	//리턴 타입 : O , 매개변수 : X
//	String getGrade() {
//		//성적 등급 구해서 리턴하는 기능 작성
//		if(score == 4.5)
//			return "A+";
//		else if(score >= 4.0)
//			return "A";
//		else if(score >= 3.5)
//			return "B+";
//		else if(score >= 3.0)
//			return "B";
//		else if(score >= 2.5)
//			return "C+";
//		else if(score >= 2.0)
//			return "C";
//		else if(score >= 1.5)
//			return "D+";
//		else if(score >= 1.0)
//			return "D";
//		else 
//			return "F";
//	}
	String getGrade() {
		String grade = "F";
		//성적 등급 구해서 리턴하는 기능 작성
		if(score == 4.5)
			grade = "A+";
		else if(score >= 4.0)
			grade = "A";
		else if(score >= 3.5)
			grade =  "B+";
		else if(score >= 3.0)
			grade =  "B";
		else if(score >= 2.5)
			grade =  "C+";
		else if(score >= 2.0)
			grade =  "C";
		else if(score >= 1.5)
			grade =  "D+";
		else if(score >= 1.0)
			grade =  "D";
		
		return grade;
	}
	//리턴 타입 : X, 매개변수 : O 
	void setScore(double s) {
		score = s;
	}
	
	//리턴 타입 : X, 매개변수 : X
	void printStudentInfo() {
		//학번 이름 학과명 평점(성적등급)
		System.out.println(studentNo + " " + studentName + " " 
				+ majorName + " " + score + "("+getGrade()+")");
		System.out.printf("%s %s %s %.2f(%s)",
				studentNo,studentName,majorName,score,getGrade());
	}
}




