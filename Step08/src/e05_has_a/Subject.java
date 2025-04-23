package e05_has_a;

public class Subject {
	private String title;
	private int score;
	
	//필드 초기화 하는 생성자
	public Subject(String title, int score) {
		super();
		this.title = title;
		this.score = score;
	}

	//setter/getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//toString
	@Override
	public String toString() {
		return title + " / " + score;
	}
	
	//getGrade -> A+ A B+ B C+ C D+ D F
	public String getGrade() {
		String grade = "F";
		switch(score / 5) {
		case 20, 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
			grade = "D+";
			break;
		case 12:
			grade = "D";
			break;
		}
		
		return grade;
	}
}





