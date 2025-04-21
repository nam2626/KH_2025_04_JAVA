package e05_array_class;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person() Constructor");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " / " + age;
	}
	
	
	
}
