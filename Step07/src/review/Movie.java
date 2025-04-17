package review;

public class Movie {
	String title;
	String director;
	double score;
	
	void init(String t, String d, double s) {
		title = t;
		director = d;
		score = s;
	}
	
	String getGrade() {
		return score >= 8.0 ? "추천" : "보통";
	}
}
