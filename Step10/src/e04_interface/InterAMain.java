package e04_interface;

public class InterAMain {

	public static void run(InterA inter) {
		inter.interA();
	}
	
	public static void main(String[] args) {
		InterClassA aClass = new InterClassA();
		aClass.interA();
		aClass.interA1();
		System.out.println(aClass.circleArea(4));
		
		InterBClass bClass = new InterBClass();
		bClass.interA();
		bClass.interA1();
		bClass.interB();
		
		run(aClass);
		run(bClass);
		
	}

}
