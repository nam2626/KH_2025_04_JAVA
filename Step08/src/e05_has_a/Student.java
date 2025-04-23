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
		for(Subject sub : subList) {
			
		}
		return "";
	}
}













