
public class E11_BookQuest2 {
	
	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++) {
			if(dan % 2 != 0) 
				continue;
			System.out.println(" -- " + dan + "단 -- ");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
	}

}
