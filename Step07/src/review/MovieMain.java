package review;

public class MovieMain {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.init("기생충", "봉준호", 8.4);
		System.out.println(m.getGrade());
		
		Movie[] arr = new Movie[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
