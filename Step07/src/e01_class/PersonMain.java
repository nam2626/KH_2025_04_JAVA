package e01_class;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		
//		p2.name = "김철수";
//		p2.age = 33;
		p2.init("김철수", 33);
		
		p1.printInfo();
		p2.printInfo();
	}

}
