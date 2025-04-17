package e02_constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();
		
		Person p2 = new Person("홍길동");
		p2.printInfo();
		
		Person p3 = new Person("김철수", 33);
		p3.printInfo();
		
	}

}
