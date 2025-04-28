package e02_abstract;

public abstract class Person extends Animal {
	public void speak() {
		System.out.println("사람이 말을 합니다.");
	}
	//부모가 추상 메서드를 재정하면,
	//자식이 재정의 할 필요는 없다.
//	@Override
//	public void run() {
//		System.out.println("사람이 두발 뜁니다.");
//	}
}
