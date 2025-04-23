package e05_has_a;

import java.util.ArrayList;

public class Student {
	private String stdNo;
	private String stdName;
	private String majorName;
	private ArrayList<Subject> subList;
	
	public Student(String stdNo, String stdName, String majorName) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.majorName = majorName;
		this.subList = new ArrayList<Subject>();
	}

	//과목 추가
	public void addSubject(Subject s) {
		subList.add(s);
	}
	
	//점수 정보 리턴
	//과목리스트에 저장된 과목들의 평점 평균과 등급을 아래와 같은 형태로 리턴
	//	4.3 / A
	public String getGrade() {
		//평점의 평균을 구하기
		double avg = 0.0;
		for(Subject sub : subList) {
			avg += sub.getGradeScore();
		}
		avg /= subList.size();
		
		String grade = "F";
		switch((int)(avg * 10) / 5) {
		case 9:
			grade = "A+";
			break;
		case 8:
			grade = "A";
			break;
		case 7:
			grade = "B+";
			break;
		case 6:
			grade = "B";
			break;
		case 5:
			grade = "C+";
			break;
		case 4:
			grade = "C";
			break;
		case 3:
			grade = "D+";
			break;
		case 2:
			grade = "D";
			break;
		
		}
		
		return avg + " / " + grade ;
	}

	@Override
	public String toString() {
		return stdNo + " / " + stdName + 
				" / "+ majorName + " / " + getGrade();
	}
	
}













