package e01_object;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		Person s = new Person("홍길동", 20);
		
		System.out.println(p.hashCode());
		System.out.println(System.identityHashCode(p));
		System.out.println(s.hashCode());
		//내용은 같지만 메모리 주소가 달라서 false가 나옴
		System.out.println(p == s);
		System.out.println(p.equals(s));
		
		
	}
}




