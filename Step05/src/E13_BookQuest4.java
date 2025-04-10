
public class E13_BookQuest4 {

	public static void main(String[] args) {
		int ea = 6;

		for(int i = 0; i < ea; i++) {

			for(int j=0; j < ea - i - 1; j++) {
				System.out.print(" "); 
			}

			for(int j=0; j < i * 2 + 1; j++) { 
				System.out.print("*"); 
			}

			System.out.println();
		}


	}

}
