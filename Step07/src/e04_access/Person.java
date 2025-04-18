package e04_access;
/*
 * 	접근 제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 
 * 		private : 해당 클래스 내에서만 접근이 가능(외부에서는 접근 X)
 * 		protected : 해당 클래스를 상속 받은 자식(자손들까지 가능)클래스들까지 접근이 가능
 * 		default : 접근제어자를 사용안했을 때 자동으로 붙음, 같은 패키지 내에있는 클래스들까지 접근이 가능
 * 		public : 누구든지 접근이 가능
 * 
 * 
 */
public class Person {
	private String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	void setAge(int age) {
		if(age > 0)
			this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}




