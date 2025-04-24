package e01_extends;

public class Human extends Animal {
	
	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("제 이름은 "+ name + " 입니다.");
	}

}
