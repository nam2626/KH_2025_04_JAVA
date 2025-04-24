package e03_super;

public class Animal {
	//나이
	private int age;
	//나이 초기화하는 생성자
	public Animal(int age) {
		this.age = age;
	}
	//setter/getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//나이 출력 메서드
	public void printAge() {
		System.out.println("나이 : " + age);
	}
}



