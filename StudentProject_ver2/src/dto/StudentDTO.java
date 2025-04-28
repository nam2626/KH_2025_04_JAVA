package dto;

import java.util.Objects;

public class StudentDTO {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;

	//기본 생성자
	public StudentDTO() {	}

	//필드 전체 초기화 생성자
	public StudentDTO(String studentNo, String studentName, String majorName, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}
	//setter / getter
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	//toString : 20001111 홍길동 컴퓨터공학과 3.45
	@Override
	public String toString() {
		return studentNo + " " + studentName + " "+ majorName
				+ " " + score;
	}

	@Override
	public int hashCode() {
		System.out.println("StudentDTO - hashCode");
		return Objects.hash(studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("StudentDTO - equal");
		if (this == obj)
			return true;
		if (!(obj instanceof StudentDTO))
			return false;
		
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(studentNo, other.studentNo);
	}
	
	
}




