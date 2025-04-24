package e01_extends;

public class Human extends Animal {
	
	private String name;
	
	public Human(String name) {
		this.name = name;
		System.out.println("Human 생성자");
	}

	public void printInfo() {
		System.out.println("제 이름은 "+ name + " 입니다.");
		//자식 클래스는 부모클래스가 아니라서 private 멤버에 접근이 불가능
		System.out.println("나이는 "+ age + "살 입니다.");
		
	}

}
