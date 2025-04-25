package e01_object;

public class ObjectMain {

	public static void main(String[] args) {
		Student s1 = new Student("1111", "홍길동", "컴퓨터공학과", 2.1);
		Student s2 = new Student("1111", "홍길동", "컴퓨터공학과", 2.1);
		Student s3 = s1;
		Person p = new Person("홍길동", 20);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(null));
		System.out.println(s1.equals(p));
		
		System.out.println(s1.getClass().getName());
		System.out.println(p.getClass().getName());
				
	}

}
