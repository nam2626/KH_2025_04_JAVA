package e01_extends;

public class Animal {
	//protected 접근제어자 : 부모클래스를 상속 받는 자식(자손)클래스까지 접근 가능
	protected int age;

	public Animal() {
		age = 20;
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
}
