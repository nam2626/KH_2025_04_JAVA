package e06_static;

public class CountMain {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count c5 = new Count();
		
		c1.addCount();		c2.addCount();
		c3.addCount();		c4.addCount();
		c5.addCount();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}

}
