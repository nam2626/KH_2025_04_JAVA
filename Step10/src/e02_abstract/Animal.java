package e02_abstract;
/*
 * 	추상 클래스(Abstract Class)
 * 		- class 키워드 앞에 abstract가 붙음
 * 		- 추상 클래스는 직접적으로 생성되지 않음
 * 		- 자식 클래스가 생성이 될 때만 간접적으로 생성
 * 		- 일반적으로는 최상위 클래스로 존재(최초에 클래스의 구조를 잡는 용도)
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	//추상 메서드
	public abstract void run() ;
	
}

