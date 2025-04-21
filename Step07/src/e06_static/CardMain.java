package e06_static;

public class CardMain {

	public static void main(String[] args) {
		Card[] arr = new Card[4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Card("이름" + i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
