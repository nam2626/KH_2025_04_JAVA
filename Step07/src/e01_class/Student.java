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
	String getGrade() {
		//성적 등급 구해서 리턴하는 기능 작성
		if(score == 4.5)
			return "A+";
		else if(score >= 4.0)
			return "A";
		else if(score >= 3.5)
			return "B+";
		else if(score >= 3.0)
			return "B";
		else if(score >= 2.5)
			return "C+";
		else if(score >= 2.0)
			return "C";
		else if(score >= 1.5)
			return "D+";
		else if(score >= 1.0)
			return "D";
		else 
			return "F";
		
		
		
	}
	//리턴 타입 : X, 매개변수 : O 
	//리턴 타입 : X, 매개변수 : X
	
}




