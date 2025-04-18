package e04_access;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		System.out.println(p.toString());
		p.setAge(200);
		System.out.println(p.toString());
		p.setAge(-100);
		System.out.println(p.toString());
		p.age = -100;
		System.out.println(p.toString());
		//p.name = "김철수";//private 멤버는 직접 접근이 불가능
		p.setName("김철수");
		System.out.println(p.toString());
		System.out.println(p.getName());
	}

}
