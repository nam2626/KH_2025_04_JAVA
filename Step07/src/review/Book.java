package review;

public class Book {
	String title;
	String author;
	int price;
	
	//초기화
	void init(String t, String a, int p){
		title = t;
		author = a;
		price = p;
	}
	//책 정보 출력
	void printBookInfo() {
		System.out.println(title + " " + author + " " + price);
	}
}
