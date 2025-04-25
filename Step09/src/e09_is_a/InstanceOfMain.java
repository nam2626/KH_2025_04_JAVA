package e09_is_a;

public class InstanceOfMain {
	public static void run(Animal a) {
		if(a instanceof Dog) {
			Dog d = (Dog) a;
			d.run();
		}else if(a instanceof Person) {
			Person p = (Person) a;
			p.study();
		}else {
			a.eat();
		}
			
	}
	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		
		//자식클래스는 부모 클래스로 자동으로 형변환이 된다.
		//작은 개념이 큰 개념이 되는 형태이기 때문에 가능
		Animal a = p;
		a.eat();
		//부모클래스가 자식 클래스로 형변환 할려면 강제로 형변환을 해야함.
		//큰 개념이 작은 개념으로 형변환 하는 형태는 강제로 해야함.
		//이떄에는 해당 객체가 자식클래스 타입인지 확인을 해야함.
		//d = (Dog) a;//원본이 Person이었기 떄문에 에러가 발생함
		//해당 객체가 해당 클래스로 형변환이 되는지 체크
		System.out.println(a instanceof Person);
		System.out.println(a instanceof Dog);
		
//		a = d;
		a = p;
		if(a instanceof Dog) {
			Dog t = (Dog) a;
			t.run();
		}
		
		run(new Animal());
		run(new Dog());
		run(new Person());
	}

}
