package review;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		book.init("자바 프로그래밍", "김철수", 25000);
		book.printBookInfo();
	}

}
