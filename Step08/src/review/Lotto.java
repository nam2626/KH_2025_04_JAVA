package review;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	

	public static ArrayList<Integer> generateLotto() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		while(list.size() < 6) {
			int n = r.nextInt(1, 46);
			if(list.contains(n)) 
				continue;
			list.add(n);
		}
		
		return list;
	}

	public static void printArray(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%2d ", list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
			printArray(generateLotto());
	}
}
