package e04_access;

//학번 이름 학과명 평점
public class Student {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;
	
	public Student(String studentNo, String studentName, String majorName, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}
	
	
	
	
}
