package dto;

// 학생 정보를 담기 위한 클래스(Data Transfer Object)
public class StudentDTO {
	
	// 학생 학번
	private String studentNo;
	// 학생 이름
	private String studentName;
	// 학생의 전공 학과명
	private String majorName;
	// 학생의 평점
	private double score;

	// 기본 생성자 (필수적으로 작성하는 것이 좋음)
	public StudentDTO() { }

	// 모든 필드를 초기화하는 생성자
	public StudentDTO(String studentNo, String studentName, String majorName, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	// Getter와 Setter (필드 접근 메서드)
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

	// 객체를 문자열 형태로 출력 (오버라이딩한 메서드)
	// 예시 출력: 20001111 홍길동 컴퓨터공학과 3.45
	@Override
	public String toString() {
		return studentNo + " " + studentName + " " + majorName + " " + score;
	}
}
