package e02_abstract;

public class AbstractMain {

	public static void main(String[] args) {
		//추상 클래스는 직접적인 생성이 되지 않음.
//		Animal a = new Animal();
		Dog d = new Dog();
		d.run();
		//추상 클래스도 데이터 타입, 자식 클래스를 형변환 시켜서 저장 작업은 됨
		Animal a = d;
		a.run();
		
		a = new Human();
		a.run();
		
		//다른 서브클래스로 형변환 X
		Dog d1 = (Dog) a;
		d1.eat();
	}

}
