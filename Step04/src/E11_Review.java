
public class E11_Review {

	public static void main(String[] args) {
		int i = 1;
		
		while(i<101) {
			if(i % 2 == 0)
				System.out.println(i);
			i++;
		}
		System.out.println("----");
		//-------------------------------------
		int j = 1;
		
		while(j < 101) {
			if(j % 3 == 0 && j % 5 == 0)
				System.out.println(j);
			j++;
		}
		
		
	}

}





